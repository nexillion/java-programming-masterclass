package com.company;

public class Calculator
{
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber()
    {
        return this.firstNumber;
    }

    public double getSecondNumber()
    {
        return this.secondNumber;
    }

    public double setFirstNumber(double firstNumber)
    {
        return this.firstNumber = firstNumber;
    }

    public double setSecondNumber(double secondNumber)
    {
        return this.secondNumber = secondNumber;
    }

    public double getAdditionResult()
    {
        return setFirstNumber(firstNumber) + setSecondNumber(secondNumber);
    }

    public double getSubtractionResult()
    {
        return setFirstNumber(firstNumber) - setSecondNumber(secondNumber);
    }

    public double getMultiplicationResult()
    {
        return setFirstNumber(firstNumber) * setSecondNumber(secondNumber);
    }

    public double getDivisionResult()
    {
        if(setSecondNumber(secondNumber) == 0)
        {
            return 0;
        }
        else
        {
            return setFirstNumber(firstNumber) / setSecondNumber(secondNumber);
        }
    }
}