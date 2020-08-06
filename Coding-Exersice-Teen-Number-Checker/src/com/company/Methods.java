package com.company;

public class Methods
{
    public static boolean hasTeen (int firstNum, int secondNum, int thirdNum)
    {
        if(firstNum >= 13 && firstNum <= 19)
        {
            return true;
        }
        else if(secondNum >= 13 && secondNum <= 19)
        {
            return true;
        }
        else if(thirdNum >= 13 && thirdNum <= 19)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}