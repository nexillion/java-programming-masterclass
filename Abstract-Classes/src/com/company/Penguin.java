package com.company;

public class Penguin extends Bird
{
    public Penguin(String name)
    {
        super(name);
    }

    @Override
    public void canFly()
    {
        System.out.println(getName() + " cannot fly.");
    }
}
