package com.company;

import java.lang.reflect.Method;

public class Methods
{
    public static void getFirstNumberWithoutParameters()
    {
        Calculator firstNumber = new Calculator();
        System.out.println("This is value of firstNumber before setting = " + firstNumber.getFirstNumber());
    }

    public static void getSecondNumberWithoutParameters()
    {
        Calculator secondNumber = new Calculator();
        System.out.println("This is value of firstNumber before setting = " + secondNumber.getSecondNumber());
    }

    public static void setFirstNumberWithOneParameter()
    {
        Calculator firstNumber = new Calculator();
        firstNumber.setFirstNumber(5);

        System.out.println("firstNumber after parameter is set = " + firstNumber.getFirstNumber());
    }

    public static void setSecondNumberWithOneParameter()
    {
        Calculator secondNumber = new Calculator();
        secondNumber.setSecondNumber(69);

        System.out.println("firstNumber after parameter is set = " + secondNumber.getSecondNumber());
    }

    public static double getAdditionResult()
    {
        Calculator firstNumber = new Calculator();
        Calculator secondNumber = new Calculator();

        firstNumber.setFirstNumber(5);
        secondNumber.setSecondNumber(69);

        return (firstNumber.getFirstNumber() + secondNumber.getSecondNumber());
    }

    public static double getSubtractionResult()
    {
        Calculator firstNumber = new Calculator();
        Calculator secondNumber = new Calculator();

        firstNumber.setFirstNumber(5);
        secondNumber.setSecondNumber(69);

        return (firstNumber.getFirstNumber() - secondNumber.getSecondNumber());
    }

    public static double getMultiplicationResult()
    {
        Calculator firstNumber = new Calculator();
        Calculator secondNumber = new Calculator();

        firstNumber.setFirstNumber(5);
        secondNumber.setSecondNumber(69);

        return (firstNumber.getFirstNumber() * secondNumber.getSecondNumber());
    }

    public static double getDivisionResult()
    {
        Calculator firstNumber = new Calculator();
        Calculator secondNumber = new Calculator();

        firstNumber.setFirstNumber(5);
        secondNumber.setSecondNumber(69);

        return (firstNumber.getFirstNumber() / secondNumber.getSecondNumber());
    }
}
