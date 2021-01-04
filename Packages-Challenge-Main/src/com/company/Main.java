package com.company;

import com.company.mylibrary.Series;

public class Main {

    public static void main(String[] args)
    {
        for(int i = 0; i <= 10; i++)
        {
            System.out.println("nSum for i = " + i + " : " + Series.nSum(i));
            System.out.println("-------------------");
            System.out.println("nFactorial for i = " + i + " : " + Series.nFactorial(i));
            System.out.println("-------------------");
            System.out.println("nFibonacci for i = " + i + " : " + Series.nFibonacci(i));
            System.out.println("-------------------");
        }
    }
}
