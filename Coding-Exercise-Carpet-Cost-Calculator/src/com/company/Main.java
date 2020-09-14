package com.company;

public class Main {

    public static void main(String[] args)
    {
        Carpet carpet = new Carpet(5);
        Floor floor = new Floor(2,3);

        Calculator calculator = new Calculator(floor, carpet);
        System.out.println(calculator.getTotalCost());
    }
}