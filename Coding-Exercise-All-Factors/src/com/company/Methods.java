package com.company;

public class Methods
{
    public static void printFactors(int number)
    {
        if(number < 1)
        {
            System.out.println("Invalid Value.");
        }
        else
        {
            int counter = 1;
            while(counter <= number)
            {
                if(number % counter == 0)
                {
                    System.out.println(counter);
                }
                counter++;
            }
        }
    }
}
