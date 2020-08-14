package com.company;

public class Methods
{
    public static boolean isPalindrome(int number)
    {
        int reverse = 0;
        int countDown = number;

        while(countDown != 0)
        {
            int storeVariable = countDown % 10;
            reverse = reverse * 10; // first time through while loop = 0*10
            reverse = reverse + storeVariable;
            countDown = countDown / 10;
        }

        System.out.println(number);
        if(reverse == number)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
