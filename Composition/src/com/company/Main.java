package com.company;

public class Main {

    public static void main(String[] args)
    {
        Dimensions dimensions = new Dimensions(50, 50, 10);
        Case theCase = new Case("Hardboi", "Some Unknown Company", "ZappyBoi 3000", dimensions);
        // Dimensions instance is created like normal and called in the Case instance construction
        Monitor monitor = new Monitor("Screeny", "Some Unknown Company", 41, new Resolution(1920, 1080));
        // Resolution instance is not created like normal, but instead is created in the constructor call for Monitor
        Motherboard motherboard = new Motherboard("H81M-HDS", "A$$Rock", 2, 1, "v0.12.14");
        // This is a normal constructor.

        Computer computer = new Computer(motherboard, monitor, theCase);

        computer.getMonitor().drawPixelAt(151, 1561, "Blue");
        computer.powerOn();

        computer.getMotherboard().loadProgram("Obont0");
    }
}
