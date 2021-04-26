package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int x = 98;
        int y = 0;

        System.out.println(divideLBYL(x, y));
        System.out.println(divideEAFP(x, y));
    }

    // LBYL == Look Before You Leap
    // prevents exception before it happens
    private static int divideLBYL(int x, int y)
    {
        if(y != 0)
        {
            return x / y;
        }
        else
        {
            return 0;
        }
    }

    // EAFP == Easier to Ask Forgiveness than it is to get Permission
    // catches exception and does something when it happens
    private static int divideEAFP(int x, int y)
    {
        try
        {
            return x / y;
        } catch(ArithmeticException e)
        {
            return 0;
        }
    }
}