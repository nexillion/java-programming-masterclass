package com.company;

import static com.company.ThreadColor.*;

public class MyThread extends Thread
{
    @Override
    public void run()
    {
        // The run() method of thread class does nothing, unless overwritten (like an Interface)
        System.out.println(ANSI_RED + "Thread created using the MyThread class.");
    }
}
