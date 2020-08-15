package com.company;

public class Methods
{
    public static int getGreatestCommonDivisor (int first, int second)
    {
        int counter = 1;
        int storeVariable = 0;

        if(first < 10 || second < 10)
        {
            return -1;
        }
        else
        {
            if(first > second)
            {
                while(counter <= first)
                {
                    if(first % counter == second % counter && first % counter == 0)
                    {
                        storeVariable = counter;
                    }
                    counter++;
                }
            }
            else
            {
                while (counter <= second)
                {
                    if(first % counter == second % counter && first % counter == 0)
                    {
                        storeVariable = counter;
                    }
                    counter++;
                }
            }
            return storeVariable;
        }
    }
}
