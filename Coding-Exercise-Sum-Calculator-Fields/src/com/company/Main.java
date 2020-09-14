package com.company;

public class Main {

    public static void main(String[] args)
    {
<<<<<<< Updated upstream
        Calculator calculator = new Calculator();
=======
        SimpleCalculator calculator = new SimpleCalculator();
>>>>>>> Stashed changes
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("subtract = " + calculator.getSubtractionResult());
<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply = " + calculator.getMultiplicationResult());
        System.out.println("divide = " + calculator.getDivisionResult());
    }
}
