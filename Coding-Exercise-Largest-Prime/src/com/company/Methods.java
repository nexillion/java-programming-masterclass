package com.company;

public class Methods
{
    public static int getLargestPrime(int number)
    {
        int counter = 2;
        int storeVariable = -1;

        if(number < 0)
        {
            return -1;
        }
        else
        {
            int numberUpdate = number;

            while(counter < number)
            {
                if(numberUpdate % counter == 0)
                {
                    numberUpdate = numberUpdate / counter;
                    storeVariable = counter;
                }
                else
                {
                    counter++;
                }
            }

            int primeCheck = 2;

            while(primeCheck <= 37 && primeCheck < storeVariable)
            {
                if(storeVariable % primeCheck == 0)
                {
                    return -1;
                }
                else
                {
                    primeCheck++;
                }
            }
            return storeVariable;
        }
    }
}
