package com.company;

public class Methods
{
    public static double area (double radius)
    {
        if(radius < 0)
        {
            return -1;
        }
        else
        {
            return (radius * radius * 3.14159);
        }
    }

    public static double area (double x, double y)
    {
        if(x < 0 || y < 0)
        {
            return -1;
        }
        else
        {
            return (x * y);
        }
    }
}
