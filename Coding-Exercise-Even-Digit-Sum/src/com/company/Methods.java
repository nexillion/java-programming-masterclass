package com.company;

public class Methods
{
    public static int getEvenDigitSum(int number)
    {
        if(number >= 0)
        {
            int countDown = number;
            int evenDigitSum = 0;

            while(countDown != 0)
            {
                int evenDigitCheck = countDown % 10;

                if(evenDigitCheck % 2 == 0)
                {
                    evenDigitSum = evenDigitSum + evenDigitCheck;
                }

                countDown = countDown / 10;
            }
            return evenDigitSum;
        }
        else
        {
            return -1;
        }
    }
}
