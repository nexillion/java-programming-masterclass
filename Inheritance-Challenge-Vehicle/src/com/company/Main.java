package com.company;

import java.util.spi.LocaleNameProvider;

public class Main {

    public static void main(String[] args)
    {
        Lancer lancer = new Lancer(true, true);
        lancer.streetReady();
        lancer.getSize();
        lancer.move(50, -90);

        E320 e320 = new E320();
        e320.getSize();
        e320.getWheels();
        e320.move(90,188);
    }
}
