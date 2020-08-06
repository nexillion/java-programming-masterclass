package com.company;

public class Main {

    public static void main(String[] args)
    {
        boolean wakeUp = Methods.shouldWakeUp(true,1);
        System.out.println("Barking: true, 1:00 = "+wakeUp);

        wakeUp = Methods.shouldWakeUp(false,2);
        System.out.println("Barking: false, 2:00 = "+wakeUp);

        wakeUp = Methods.shouldWakeUp(true,8);
        System.out.println("Barking: true, 8:00 = "+wakeUp);

        wakeUp = Methods.shouldWakeUp(true,-1);
        System.out.println("Barking: true, -1:00 (Invalid) = "+wakeUp);
    }
}
