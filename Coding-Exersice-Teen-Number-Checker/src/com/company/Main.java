package com.company;

public class Main {

    public static void main(String[] args)
    {
        boolean methodOutput = Methods.hasTeen(9,99,19);
        System.out.println(methodOutput);

        methodOutput = Methods.hasTeen(23,15,42);
        System.out.println(methodOutput);

        methodOutput = Methods.hasTeen(22,23,32);
        System.out.println(methodOutput);
    }
}
