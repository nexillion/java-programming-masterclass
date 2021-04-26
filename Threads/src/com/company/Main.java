package com.company;

import java.util.Random;

import static com.company.ThreadColor.*;

public class Main
{
    public static void main(String[] args)
    {
        // anonymous thread creation
        new Thread()
        {
            public void run()
            {
                System.out.println(ANSI_GREEN + "Anonymous class thread.");
            }
        }.start();

        // creating a thread, using a dedicated class
        MyThread myThread = new MyThread();
        myThread.run();

        // anonymous thread using the MyRunnable class as body.
        MyRunnable myRunnable = new MyRunnable();
        new Thread(myRunnable).start();

        // main thread
        System.out.println(ANSI_PURPLE+"Main thread.");
    }
}
