package com.company;

public class Point
{
    private int x;
    private int y;

    public Point()
    {
        System.out.println("Empty Constructor.");
    }

    public Point(int x, int y)
    {
        this.x = x;
        this.y =y;
    }

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public double distance()
    {
        return Math.sqrt((this.x - 0.0) * (this.x - 0.0) + (this.y - 0.0) * (this.y - 0.0));
    }

    public double distance(int x, int y)
    {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance(Point second)
    {
        return Math.sqrt((this.x - second.x) * (this.x - second.x) + (this.y - second.y) * (this.y - second.y));
    }
}