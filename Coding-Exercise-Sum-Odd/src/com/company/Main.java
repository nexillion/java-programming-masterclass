package com.company;

public class Main {

    public static void main(String[] args)
    {
        int returedValue = Methods.sumOdd(1, 100);
        System.out.println("Returned = " + returedValue);

        returedValue = Methods.sumOdd(-1, 100);
        System.out.println("Returned = " + returedValue);

        returedValue = Methods.sumOdd(100, 100);
        System.out.println("Returned = " + returedValue);

        returedValue = Methods.sumOdd(13, 13);
        System.out.println("Returned = " + returedValue);

        returedValue = Methods.sumOdd(100, -100);
        System.out.println("Returned = " + returedValue);

        returedValue = Methods.sumOdd(100, 1000);
        System.out.println("Returned = " + returedValue);
    }
}
