package com.company;

public class Methods
{
    public static void printYearsAndDays(long minutes)
    {
        if(minutes<0)
        {
            System.out.println("Invalid Value.");
        }
        else
        {
            //60 * 24 = 1440
            long years = 0;
            long days = minutes / 1440;
            if (days>=365)
            {
                years = days / 365;
                days = days % 365;
            }
            System.out.println(minutes + " min = " + years + " y and " + days + "d");
        }
    }
}
