package com.company;

public class Main {

    public static void main(String[] args)
    {
        double outputFromMethod = Methods.area(5);
        System.out.println("For radius 5 = " + outputFromMethod);

        outputFromMethod = Methods.area(-1);
        System.out.println("For radius -1 = " + outputFromMethod);

        outputFromMethod = Methods.area(5, 4);
        System.out.println("For x = 5, y = 4 => " + outputFromMethod);

        outputFromMethod = Methods.area(-1, 4);
        System.out.println("For x = -1, y = 4 => " + outputFromMethod);
    }
}
