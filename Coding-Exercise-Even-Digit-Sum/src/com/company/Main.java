package com.company;

public class Main {

    public static void main(String[] args)
    {
        int outputInt = Methods.getEvenDigitSum(123456789);
        System.out.println("Output Int Value = " + outputInt);

        outputInt = Methods.getEvenDigitSum(252);
        System.out.println("Output Int Value = " + outputInt);

        outputInt = Methods.getEvenDigitSum(-22);
        System.out.println("Output Int Value = " + outputInt);
    }
}
