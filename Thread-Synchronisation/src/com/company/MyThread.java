package com.company;

import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread
{
    public MyThread(String name)
    {
        Thread.currentThread().setName(name);
    }

    @Override
    public void run()
    {
        String color = ThreadColor.getColor(Thread.currentThread().getName());

        // manual lock method
        ReentrantLock lock = new ReentrantLock();
        {
            lock.lock();
            for(int i = 0; i < 10; i++)
            {
                System.out.println(color + Thread.currentThread().getName() + ": i =" + i);
            }
            lock.unlock();
        }

//        // synchronized keyword method
//        synchronized (this)
//        {
//            for(int i = 0; i < 10; i++)
//            {
//                System.out.println(color + Thread.currentThread().getName() + ": i =" + i);
//            }
//        }
    }
}
