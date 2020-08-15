package com.company;

public class Main {

    public static void main(String[] args)
    {
        boolean outputBoolean = Methods.isPerfectNumber(6);
        System.out.println(outputBoolean);

        outputBoolean = Methods.isPerfectNumber(28);
        System.out.println(outputBoolean);

        outputBoolean = Methods.isPerfectNumber(5);
        System.out.println(outputBoolean);

        outputBoolean = Methods.isPerfectNumber(-1);
        System.out.println(outputBoolean);
    }
}
