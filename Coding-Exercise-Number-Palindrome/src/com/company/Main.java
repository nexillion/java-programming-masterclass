package com.company;

public class Main {

    public static void main(String[] args)
    {
        boolean outputBoolean = Methods.isPalindrome(-1221);
        System.out.println("Output boolean = " + outputBoolean);

        outputBoolean = Methods.isPalindrome(707);
        System.out.println("Output boolean = " + outputBoolean);

        outputBoolean = Methods.isPalindrome(12212);
        System.out.println("Output boolean = " + outputBoolean);
    }
}
