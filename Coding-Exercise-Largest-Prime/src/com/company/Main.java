package com.company;

public class Main {

    public static void main(String[] args)
    {
        int outputInt = Methods.getLargestPrime(21);
        System.out.println(outputInt);

        outputInt = Methods.getLargestPrime(217);
        System.out.println(outputInt);

        outputInt = Methods.getLargestPrime(0);
        System.out.println(outputInt);

        outputInt = Methods.getLargestPrime(45);
        System.out.println(outputInt);

        outputInt = Methods.getLargestPrime(-1);
        System.out.println(outputInt);

        outputInt = Methods.getLargestPrime(486456132);
        System.out.println(outputInt);
    }
}
