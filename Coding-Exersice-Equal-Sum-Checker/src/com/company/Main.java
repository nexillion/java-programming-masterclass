package com.company;

public class Main {

    public static void main(String[] args)
    {
        boolean methodOutput = Methods.hasEqualSum(1,1,1);
        System.out.println(methodOutput);

        methodOutput = Methods.hasEqualSum(1,1,2);
        System.out.println(methodOutput);

        methodOutput = Methods.hasEqualSum(1,-1,0);
        System.out.println(methodOutput);
    }
}
