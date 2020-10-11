package com.company;

public class Vehicle
{
    private String name;
    private double length;
    private double width;
    private double height;

    int currentMovementSpeed; // in kilometers
    int currentDirection; // in degrees when North == 0

    public Vehicle(String name, double length, double width, double height)
    {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;

        this.currentMovementSpeed = 0;
        this.currentDirection = 0;
    }

    public double getSize()
    {
        return this.length * this.width * this.height;
    }

    public void steering(int direction)
    {
        if(this.currentDirection + direction >= 360)
        {
            int fullCircle = (this.currentDirection + direction) % 360;
            this.currentDirection = fullCircle;
        }
        else if(this.currentDirection + direction < 0)
        {
            direction = direction % 360;
            int fullCircle = 360 + (this.currentDirection + direction);
            this.currentDirection = fullCircle;
        }
        else
        {
            this.currentDirection += direction;
        }
    }

    public void move(int movementSpeed, int direction)
    {
        steering(direction);
        this.currentMovementSpeed = movementSpeed;

        System.out.println(getName() + ": Facing " + this.currentDirection + " degree angle (with North = 0)");
        System.out.println(getName() + ": Moving at " + this.currentMovementSpeed + " km/h");
    }

    public String getName()
    {
        return name;
    }

    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public void stop()
    {
        this.currentMovementSpeed = 0;
    }
}
