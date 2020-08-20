package com.company;

public class Main {

    public static void main(String[] args)
    {
        Methods.getFirstNumberWithoutParameters();
        Methods.getSecondNumberWithoutParameters();
        Methods.setFirstNumberWithOneParameter();
        Methods.setSecondNumberWithOneParameter();

        double outputDouble = Methods.getAdditionResult();
        System.out.println("Addition result = " + outputDouble);

        outputDouble = Methods.getSubtractionResult();
        System.out.println("Subtraction result = " + outputDouble);

        outputDouble = Methods.getMultiplicationResult();
        System.out.println("Multiplication result = " + outputDouble);

        outputDouble = Methods.getDivisionResult();
        System.out.println("Division result = " + outputDouble);
    }
}
