package com.company;

public class Dog extends Animal
{
    public Dog(String name)
    {
        super(name);
    }

    @Override
    public void eat()
    {
        System.out.println(getName() + " chews its food.");
    }

    @Override
    public void breathe()
    {
        System.out.println(getName() + " breathes air.");
    }
}
