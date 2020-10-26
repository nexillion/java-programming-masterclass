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

    public int[] getIntegers()
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

    public int[] sortHighToLow()
    {
        int[] intArrays = getIntegers();

        boolean flag = true;
        int temp = 0;

        while(flag)
        {
            flag = false;

            for(int i = 0; i < this.value - 1; i++) // -1 because the if statement in this for checks for i and (i + 1)
            {
                if(intArrays[i] < intArrays[i + 1])
                {
                    temp = intArrays[i];
                    intArrays[i] = intArrays[i + 1];
                    intArrays[i + 1] = temp;

                    flag = true;
                }
            }
        }

        return intArrays;
    }
}
