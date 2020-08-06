package com.company;

public class Methods
{
    public static boolean shouldWakeUp(boolean barking, int hourOfTheDay)
    {
        if(hourOfTheDay > 24 || hourOfTheDay < 0)
        {
            System.out.println("Invalid Value.");
            return false;
        }
        else
        {
            if (barking)
            {
                if (hourOfTheDay > 22 || hourOfTheDay < 8)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        return false;
    }
}
