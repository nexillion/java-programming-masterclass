package com.company;

public class Main
{
    public static void main(String[] args)
    {
        new Thread()
        {
            @Override
            public void run()
            {
                System.out.println("Anonymous class printed line.");
            }
        }.start();

        // In this case the lambda is used to shorten the syntax of the anonymous thread call
        // the two threads do the same
        new Thread(() -> System.out.println("Anonymous class printed line using lambda")).start();
    }
}