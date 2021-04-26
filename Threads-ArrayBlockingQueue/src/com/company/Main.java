package com.company;

import java.util.Random;
import java.util.concurrent.*;
import static com.company.Main.EOF;

public class Main
{
    public static final String EOF = "EOF";
    public static void main(String[] args)
    {
        // A BlockingQueue is a queue that additionally supports operations that wait for the queue to become non-empty
        // when retrieving an element, and wait for space to become available in the queue when storing an element.
        // ArrayBlockingQueue is backed by an array and orders elements in first-in-first-out fashion
        // The buffer required is called a bounded buffed, in which a fixed-sized array holds elements inserted by
        // producers and extracted by consumers.
        // Once created, the capacity cannot be changed. Attempts to put an element into a full queue
        // will result in the operation blocking.
        ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<String>(6);

        // Executor is an object that executes submitted Runnable tasks.
        // ExecutorService is an Executor that provides methods to manage termination and methods that can produce a
        // Future for tracking progress of one or more asynchronous tasks.
        // An ExecutorService can be shut down, which will cause it to reject new tasks.
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // In this case the producers and consumers all converge on putting and removing elements from an
        // Array that is held on a buffer
        // Producers and Consumers are just names of methods that are separated on the basis of
        // putting information in the buffer (the producers) and removing it from the buffer (the consumers)
        MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_YELLOW);
        MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_PURPLE);
        MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_CYAN);

        executorService.execute(producer);
        executorService.execute(consumer1);
        executorService.execute(consumer2);

        // A Future represents the result of an computation expected to resolve after the code is called
        // Methods are provided to check if the computation is complete, to wait for its completion, and to retrieve
        // the result of the computation.
        // The result can be retrieved using method .get(); when the computation has completed.
        // The thread running Future will block if it is waiting on a variable that isn't ready yet
        Future<String> future = executorService.submit(new Callable<String>()
        {
            @Override
            public String call() throws Exception
            {
                System.out.println(ThreadColor.ANSI_WHITE + "I'm being printed for the Callable class");
                return "This is the callable result";
            }
        });

        try
        {
            System.out.println(future.get());
        }
        catch(ExecutionException e)
        {
            System.out.println("Something went wrong");
        }
        catch(InterruptedException e)
        {
            System.out.println("Thread running the task was interrupted");
        }
        executorService.shutdown();
    }
}

class MyProducer implements Runnable
{
    private ArrayBlockingQueue<String> buffer;
    private String color;

    public MyProducer(ArrayBlockingQueue<String> buffer, String color)
    {
        this.buffer = buffer;
        this.color = color;
    }

    public void run()
    {
        Random random = new Random();
        String[] numbers = { "1", "2", "3", "4", "5"};

        for(String number : numbers)
        {
            try
            {
                System.out.println(color + "Adding ... " + number);
                buffer.put(number);

                Thread.sleep(random.nextInt(1000));
            }
            catch(InterruptedException e)
            {
                System.out.println("Producer was interrupted");
            }
        }

        System.out.println(color + "Adding EOF and exiting ...");
        try
        {
            buffer.put("EOF");
        } catch(InterruptedException ignored) { }
    }
}

class MyConsumer implements Runnable
{
    private ArrayBlockingQueue<String> buffer;
    private String color;

    public MyConsumer(ArrayBlockingQueue<String> buffer, String color)
    {
        this.buffer = buffer;
        this.color = color;
    }

    public void run()
    {
        while(true)
        {
            synchronized (buffer)
            {
                try
                {
                    if (buffer.isEmpty())
                    {
                        continue;
                    }

                    if (buffer.peek().equals(EOF))
                    {
                        System.out.println(color + "Exiting");
                        break;
                    }
                    else
                    {
                        System.out.println(color + "Removed " + buffer.take());
                    }
                } catch (InterruptedException ignored) { }
            }
        }
    }
}