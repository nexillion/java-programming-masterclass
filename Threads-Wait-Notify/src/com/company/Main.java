package com.company;

import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Message message = new Message();
        // message instance is used in Writer/Reader constructors
        new Thread(new Writer(message)).start();
        new Thread(new Reader(message)).start();
        // calling Writer and Reader classes
        // same logic as:
        // new Thread(new Runnable() { ...
    }
}

class Message
{
    private String message;
    private boolean empty = true;

    // the following two methods work on checking if the empty variable is either true or false
    // the String is only truly NULL here - just after it was created

    public synchronized String read()
    {
        // read method checks if the boolean is true
        // if it is, the method stays in a permanent wait(); state
        while(empty)
        {
            try
            {
                wait();
            } catch(InterruptedException ignored) { }
        }
        // the method will reach this only when empty = false;
        // so the variable is set to true and the string is returned
        empty = true;
        notifyAll();
        // notify wakes up all threads that are waiting on this object
        return message;
    }

    public synchronized void write(String message)
    {
        // write method checks if the boolean is false
        // if it is, the method stays in a permanent wait(); state
        while(!empty)
        {
            try
            {
                wait();
            } catch(InterruptedException ignored) { }
        }
        // the method will reach this only when empty = true;
        // so the variable is set to false and the new string value is recorded
        empty = false;
        this.message = message;
        notifyAll();
        // notify wakes up all threads that are waiting on this object
    }
}

class Writer implements Runnable
{
    private Message message;

    public Writer(Message message)
    {
        // get the shared message value
        this.message = message;
    }

    public void run()
    {
        // String values are fed to the program one by one, using a String Array
        String messages[] = {
                "Humpty Dumpty sat on a wall",
                "Humpty Dumpty had a great fall",
                "All the king's horses and all the king's men",
                "Couldn't put Humpty together again"
        };

        Random random = new Random();

        for(int i=0; i<messages.length; i++)
        {
            message.write(messages[i]);
            try
            {
                Thread.sleep(random.nextInt(2000));
            } catch(InterruptedException ignored) { }
        }
        message.write("EOF");
        // EOF == End Of File
    }
}

class Reader implements Runnable
{
    private Message message;

    public Reader(Message message)
    {
        // get the shared message value
        this.message = message;
    }

    public void run()
    {
        Random random = new Random();

        for(String latestMessage = message.read(); !latestMessage.equals("EOF"); latestMessage = message.read())
        // for(create variable; if statement; looping action)
        // if ending line is reached loop breaks
        {
            System.out.println(latestMessage);
            try
            {
                Thread.sleep(random.nextInt(2000));
            } catch(InterruptedException ignored) { }
        }
    }
}