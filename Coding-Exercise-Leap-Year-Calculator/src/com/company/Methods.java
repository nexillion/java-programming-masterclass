package com.company;

public class Methods
{
    public static boolean isLeapYear(int year)
    {
        if(year < 1 || year > 9999)
        {
            System.out.println("Not in range. (1-9999)");
            return false;
        }
        else if(year % 4 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
