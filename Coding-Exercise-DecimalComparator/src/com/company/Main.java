package com.company;

public class Main {

    public static void main(String[] args)
    {
        boolean areEqual = Methods.areEqualByThreeDecimalPlaces(-3.1756,-3.175);
        System.out.println(areEqual);

        areEqual = Methods.areEqualByThreeDecimalPlaces(3.175,3.176);
        System.out.println(areEqual);

        areEqual = Methods.areEqualByThreeDecimalPlaces(3,3);
        System.out.println(areEqual);

        areEqual = Methods.areEqualByThreeDecimalPlaces(-3.123,3.123);
        System.out.println(areEqual);
    }
}
