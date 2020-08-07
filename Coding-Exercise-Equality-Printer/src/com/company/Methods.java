package com.company;

public class Methods
{
    public static void printEqual(int parameterOne, int parameterTwo, int parameterThree)
    {
        if(parameterOne < 0 || parameterTwo < 0 || parameterThree < 0)
        {
            System.out.println("Invalid Value.");
        }
        else if (parameterOne == parameterTwo && parameterOne == parameterThree)
        {
            System.out.println("All numbers are equal.");
        }
        else if (parameterOne != parameterTwo && parameterOne != parameterThree && parameterTwo != parameterThree)
        {
            System.out.println("All numbers are different.");
        }
        else
        {
            System.out.println("Nether all are equal or different.");
        }
    }
}
