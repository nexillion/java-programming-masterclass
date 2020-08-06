package com.company;

public class Methods
{
    public static boolean areEqualByThreeDecimalPlaces(double doubleVariableOne, double doubleVariableTwo)
    {
        int convertedDoubleOne = (int)(doubleVariableOne*1000);
        int convertedDoubleTwo = (int)(doubleVariableTwo*1000);
        if(convertedDoubleOne==convertedDoubleTwo)
        {
            System.out.println(doubleVariableOne + " vs " + doubleVariableTwo);
            return true;
        }
        else
        {
            System.out.println(doubleVariableOne + " vs " + doubleVariableTwo);
            return false;
        }
    }
}
