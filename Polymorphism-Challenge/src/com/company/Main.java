package com.company;

public class Main {

    public static void main(String[] args)
    {
        Z750 z750 = new Z750();
        Lancer lancer = new Lancer();
        Eclipse eclipse = new Eclipse();

        z750.startEngine();
        lancer.startEngine();
        eclipse.startEngine();

        z750.accelerate(1000);
        lancer.accelerate(1000);
        eclipse.accelerate(1000);

        z750.pressBrake(1000);
        lancer.pressBrake(1000);
        eclipse.pressBrake(1000);

        z750.stopEngine();
        lancer.stopEngine();
        eclipse.stopEngine();
    }
}
