package com.company;

public class Methods
{
    public static boolean isPerfectNumber(int number)
    {
        int counter = 1;
        int storeVariable = 0;

        if(number < 1)
        {
            return false;
        }
        else
        {
            while(counter < number)
            {
                if(number % counter == 0)
                {
                    storeVariable = storeVariable + counter;
                }
                counter++;
            }
            if(storeVariable == number)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
