package com.company;

public class Doors
{
    private boolean hasDoor;
    private int doors;

    public Doors()
    {
        this.hasDoor = true;
        this.doors = 1;
    }

    public void doorExist()
    {
        System.out.println("The room has " + this.doors + " door.");
    }

    private boolean isHasDoor()
    {
        return hasDoor;
    }

    private int getDoors()
    {
        return doors;
    }
}


