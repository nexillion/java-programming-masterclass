package com.company;

public class Room
{
    private Dimensions dimensions;
    private Furniture furniture;
    private Doors doors;
    private Windows windows;

    public Room(Dimensions dimensions, Furniture furniture, Doors doors, Windows windows)
    {
        this.dimensions = dimensions;
        this.furniture = furniture;
        this.doors = doors;
        this.windows = windows;
    }

    public Dimensions getDimensions()
    {
        return dimensions;
    }

    public Furniture getFurniture()
    {
        return furniture;
    }

    public Doors getDoors()
    {
        return doors;
    }

    public Windows getWindows()
    {
        return windows;
    }
}