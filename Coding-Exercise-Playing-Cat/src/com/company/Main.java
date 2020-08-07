package com.company;

public class Main {

    public static void main(String[] args)
    {
        boolean catPlaying = Methods.isCatPlaying(true,10);
        System.out.println(catPlaying);

        catPlaying = Methods.isCatPlaying(false,36);
        System.out.println(catPlaying);

        catPlaying = Methods.isCatPlaying(false,35);
        System.out.println(catPlaying);

        catPlaying = Methods.isCatPlaying(true,45);
        System.out.println(catPlaying);
    }
}
