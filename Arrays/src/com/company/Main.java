package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int[] intArray; // creates array
        intArray = new int[10]; // sets how many indexes will the array have

        intArray[0] = 1; // setting value to first index (counts from 0)
        intArray[1] = 2;

        double[] doubleArray = new double[10]; // create and set indexes in one line

        int[] intArray1 = {1,2,3,4,5,6,7,8,9,10}; // create array and set values to indexes (in this case java creates the indexes itself)

        System.out.println(intArray[0] + " " + intArray[1] + " " + intArray[2] + " " + intArray.length); // empty indexes are set to 0

        for(int i = 0; i < doubleArray.length; i++)
        {
            double myDouble = 451;
            doubleArray[i] = myDouble * i;

            System.out.println(doubleArray[i]);
        } // simple example for an array value setter

        //-------------------------------------------------------------------------------------------------------------------------------------
        // arrays in practice

        int arrayLength = 4;
        int exampleIntegers[] = getIntegers(arrayLength);

        for(int i = 0; i < arrayLength; i++)
        {
            System.out.println(exampleIntegers[i]);
        }

        int average = getArrayAverage(exampleIntegers, arrayLength);
        System.out.println("Average = " + average);
    }

    public static int[] getIntegers(int arrayLength)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + arrayLength + " integer values.");

        int inputValues[] = new int[arrayLength];

        for(int i = 0; i < arrayLength; i++)
        {
            inputValues[i] = scanner.nextInt();
        }
        return inputValues;
    }

    public static int getArrayAverage(int[] exampleIntegers, int arrayLength)
    {
        int average = 0;
        for(int i = 0; i < arrayLength; i++)
        {
            average = average + exampleIntegers[i];
        }
        average = Math.round(average / 4);

        return average;
    }
}
