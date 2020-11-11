package com.company;

public class Lizard extends Animal
{
    public Lizard(String name)
    {
        super(name);
    }

    @Override
    public void eat()
    {
        System.out.println(getName() + " chews.");
    }

    @Override
    public void breathe()
    {
        System.out.println(getName() + " breathes air.");
    }

    public void isColdBlooded()
    {
        System.out.println(getName() + " is a cold blooded animal.");
    }
}
