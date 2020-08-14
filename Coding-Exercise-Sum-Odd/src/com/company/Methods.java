package com.company;

public class Methods
{
    public static boolean isOdd(int number)
    {
        if(number > 0)
        {
            if(number % 2 == 1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }




    public static int sumOdd(int start, int end)
    {
        int sum = 0;

        if(start <= end && start > 0)
        {
            for (int i = start; i <= end; i++)
            {
                boolean checkIfOdd = Methods.isOdd(i);
                if (checkIfOdd)
                {
                    sum = sum + i;
                }
            }
            return sum;
        }
        else
        {
            return -1;
        }
    }
}
