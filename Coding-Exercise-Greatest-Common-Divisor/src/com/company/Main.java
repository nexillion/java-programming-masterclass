package com.company;

public class Main {

    public static void main(String[] args)
    {
        int outputInt = Methods.getGreatestCommonDivisor(25, 15);
        System.out.println("Output Value = " + outputInt);

        outputInt = Methods.getGreatestCommonDivisor(12, 30);
        System.out.println("Output Value = " + outputInt);

        outputInt = Methods.getGreatestCommonDivisor(9, 18);
        System.out.println("Output Value = " + outputInt);

        outputInt = Methods.getGreatestCommonDivisor(81, 153);
        System.out.println("Output Value = " + outputInt);
    }
}
