package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        // int outputValue = Methods.getBucketCount(3.4, 2.1, 1.5, 2);
        // System.out.println(outputValue);

        double width;
        double height;
        double areaPerBucket;
        int extraBuckets;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter width, height, area per bucket of paint and extra buckets. \n" +
                "Extra buckets should be left blank if 0. \n" +
                "You could also only enter the area to paint and area per bucket. \n");

        boolean isDouble = userInput.hasNextDouble();
        if(!isDouble)
        {
            userInput.close();
            System.out.println("Invalid Value.");
        }
        else
        {
            width = userInput.nextDouble();
            isDouble = userInput.hasNextDouble();

            if(!isDouble)
            {
                userInput.close();
                System.out.println("Invalid Value.");
            }
            else
            {
                height = userInput.nextDouble();
                isDouble = userInput.hasNextDouble();

                if(!isDouble)
                {
                    int outputValue = Methods.getBucketCount(width, height);
                    System.out.println(outputValue);
                }
                else
                {
                    areaPerBucket = userInput.nextDouble();
                    boolean isInt = userInput.hasNextInt();

                    if(!isInt)
                    {
                        int outputValue = Methods.getBucketCount(width, height, areaPerBucket);
                        System.out.println(outputValue);
                    }
                    else
                    {
                        extraBuckets = userInput.nextInt();
                        int outputValue = Methods.getBucketCount(width, height, areaPerBucket, extraBuckets);
                        System.out.println(outputValue);
                    }
                }
            }
        }
    }
}
