package com.company.mylibrary;

public class Series
{
    public static long nSum(int n)
    {
        long sumValue = 0;

        for(int i = 1; i <= n; i++)
        {
            sumValue += i;
        }

        return sumValue;
    }

    public static long nFactorial(int n)
    {
        long factorialValue = 1;

        for(int i = 1; i <= n; i++)
        {
            factorialValue *= i;
        }

        return factorialValue;
    }

    public static long nFibonacci(int n)
    {
        int counter = 3;
        long valueOne;
        long valueTwo = 1;
        long fibonacci = 1;

        if(n < 0)
        {
            return -1;
        }
        else if(n == 0)
        {
            return 0;
        }
        else if(n == 1 || n == 2)
        {
            return 1;
        }

        while(counter <= n)
        {
            valueOne = fibonacci;
            fibonacci = valueOne + valueTwo;
            valueTwo = valueOne; // set valueTwo to be ready for next loop

            counter++;
        }

        return fibonacci;
    }
}
