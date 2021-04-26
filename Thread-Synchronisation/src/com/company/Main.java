package com.company;

public class Main
{
    public static void main(String[] args)
    {
        MyThread threadOne = new MyThread("T1");
        threadOne.run();

        MyThread threadTwo = new MyThread("T2");
        threadTwo.run();

        MyThread threadThree = new MyThread("T3");
        threadTwo.run();

        MyThread threadFour = new MyThread("T4");
        threadTwo.run();

        MyThread threadFive = new MyThread("T5");
        threadTwo.run();

        MyThread threadSix = new MyThread("T6");
        threadTwo.run();
    }
}
