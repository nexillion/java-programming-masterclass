package com.company;

public class Bird extends Animal
{
    public Bird(String name)
    {
        super(name);
    }

    @Override
    public void eat()
    {
        System.out.println(getName() + " pecks.");
    }

    @Override
    public void breathe()
    {
        System.out.println(getName() + " breathes air.");
    }

    public void canFly()
    {
        System.out.println(getName() + " can also fly.");
    }
}
