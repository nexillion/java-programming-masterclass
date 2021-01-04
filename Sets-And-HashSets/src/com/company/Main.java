package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main
{
    private static Map<String, CosmicObject> solarSystem = new HashMap<>();
    private static Set<CosmicObject> planets = new HashSet<>();

    public static void main(String[] args)
    {
        CosmicObject temp = new CosmicObject("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new CosmicObject("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new CosmicObject("Earth", 365);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        CosmicObject tempMoon = new CosmicObject("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        CosmicObject jupiter = solarSystem.get("Jupiter");

        tempMoon = new CosmicObject("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        jupiter.addMoon(tempMoon);

        tempMoon = new CosmicObject("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        jupiter.addMoon(tempMoon);

        tempMoon = new CosmicObject("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        jupiter.addMoon(tempMoon);

        tempMoon = new CosmicObject("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        jupiter.addMoon(tempMoon);

        //-------------

        CosmicObject body = solarSystem.get("Earth");
        System.out.println("Moons of " + body.getName());

        for(CosmicObject earthMoons : body.getSatellites())
        {
            System.out.println("\t" + earthMoons.getName());
        }

        body = solarSystem.get("Jupiter");
        System.out.println("Moons of " + body.getName());

        for(CosmicObject jupiterMoons : body.getSatellites())
        {
            System.out.println("\t" + jupiterMoons.getName());
        }
    }
}
