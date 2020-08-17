package com.company;

import java.util.Scanner;

public class Methods
{
    public static void inputThenPrintSumAndAverage()
    {
        double sumValue = 0;
        double averageValue = 0;
        double counter = 1;

        // double values, so averageValue at the end will be closer to the truth

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number (1, 2, 3.5556, etc.).");

        while (counter > 0) // infinite loop - broken if boolean isInt = false.
        {
            boolean isInt = userInput.hasNextDouble();

            if(isInt)
            {
                double userDoubleValue = userInput.nextDouble();

                sumValue = sumValue + userDoubleValue;
                averageValue = sumValue / counter;
                counter ++;

                System.out.println("Enter another number (or any other character to stop program).");
            }
            else
            {
                break; // could also be "counter = 0;"
            }
        }

        System.out.println("Sum = " + sumValue + ", Average = " + averageValue);
    }
}
