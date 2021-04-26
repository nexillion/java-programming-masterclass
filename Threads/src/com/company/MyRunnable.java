package com.company;

import static com.company.ThreadColor.*;

public class MyRunnable implements Runnable
{
    @Override
    public void run()
    {
        System.out.println(ANSI_CYAN + "Anonymous thread created using MyRunnable class.");
    }
}
