package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
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

        public void reverseArray() // Challenge description reads that reverseArray should not return values
        {
            int[] intArray = getIntegers();

            System.out.println("Pre-reversed array = " + Arrays.toString(intArray));

            for(int i = 0; i < (intArray.length / 2); i++)
            {
                int temp = intArray[i];
                intArray[i] = intArray[(intArray.length - 1) - i]; // this.value and intArray.length are the same value
                intArray[(intArray.length - 1) - i] = temp; // intArray.length - 1 is required because else there is a logical error with out of bounds index
            }

            System.out.println("Reversed array = " + Arrays.toString(intArray));
        }
}
