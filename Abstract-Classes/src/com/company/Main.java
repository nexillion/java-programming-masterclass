package com.company;

public class Main {

    public static void main(String[] args)
    {
        Dog dog = new Dog("Huskey");
        dog.eat();
        dog.breathe();

        Bird bird = new Bird("Amadin");
        bird.eat();
        bird.breathe();
        bird.canFly();

        Lizard lizard = new Lizard("Chameleon");
        lizard.eat();
        lizard.breathe();
        lizard.isColdBlooded();

        Penguin penguin = new Penguin("Emperor Penguin");
        penguin.eat();
        penguin.breathe();
        penguin.canFly();
    }
}
