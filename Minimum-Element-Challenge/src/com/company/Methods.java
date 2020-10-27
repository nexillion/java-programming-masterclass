package com.company;

import java.util.Scanner;

public class Methods
{
    private int value;

    public Methods()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the how many indexes should the array have.");
        int inputValue = scanner.nextInt();

        this.value = inputValue;
    }

    private int[] getIntegers()
    {
        int[] intArray = new int[this.value];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + this.value + " Integers (from -2147483648 to 2147483647)");

        for(int i = 0; i < this.value; i++)
        {
            int number = scanner.nextInt();
            intArray[i] = number;
        }
        return intArray;
    }

    public int findMin()
    {
        int[] intArray = getIntegers();
        int minimumValue = intArray[0];

        for(int i = 1; i < intArray.length; i++)
        {
            if(minimumValue > intArray[i])
            {
                minimumValue = intArray[i];
            }
        }
        return minimumValue;
    }
}
