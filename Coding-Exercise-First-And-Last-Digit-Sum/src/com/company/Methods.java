package com.company;

public class Methods
{
    public static int sumFirstAndLastDigit(int number)
    {
        int countDown = number;
        int firstAndLastSum = 0;

        if(number >= 0)
        {
            while(countDown != 0)
            {
                int storeVariable = countDown % 10;

                if(countDown == number)
                {
                    firstAndLastSum = firstAndLastSum + storeVariable;
                }

                countDown = countDown / 10;

                if(countDown == 0)
                {
                    firstAndLastSum = firstAndLastSum + storeVariable;
                }
            }
            return firstAndLastSum;
        }
        else
        {
            return -1;
        }
    }
}
