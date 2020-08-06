package com.company;

public class SpeedConverter
{
    public static void printConversion(double kilometersPerHour, long convertedValue)
    {
        if (kilometersPerHour<0)
        {
            System.out.println("Invalid Value.");
        }
        else
        {
            System.out.println(kilometersPerHour +"km/h = "+ convertedValue+"mi/h");
        }
    }


    public static long toMilesPerHour(double kilometersPerHour)
    {
        if(kilometersPerHour<0)
        {
            return -1;
        }
        else
        {
            double milesPerHour = kilometersPerHour / 1.609;
            long roundedMilesPerHour = Math.round(milesPerHour);
            return roundedMilesPerHour;
        }

    }
}
