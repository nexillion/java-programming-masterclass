package com.company;

public class Methods
{
    public static void calculateInterest(double amount)
    {
        for (double interest = 2; interest < 9; interest ++)
        {
            System.out.println(amount + " at " + interest + "% interest = " + String.format("%.2f", amount * (interest / 100)));
            // String.format("%.2f", <--> tova ne6to preobrazuva output-a v string koito ne pishe sled 2rata desetica sled 0-ta
        }
    }

    public static boolean isPrime(int number)
    {
        if(number == 1)
        {
            return false;
        }
        else
        {
            for(int i = 2; i <= number / 2; i++ )
            {
                if(number % i == 0)
                {
                    return false;
                }
            }
            return true;
        }
    }
}
