package com.company;

import java.util.HashSet;
import java.util.Set;

public class CosmicObject
{
    private final String name;
    private final double orbitalPeriod;
    private final Set<CosmicObject> satellites;

    public CosmicObject(String name, double orbitalPeriod)
    {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public void addMoon(CosmicObject moon)
    {
        this.satellites.add(moon);
    }

    public String getName()
    {
        return name;
    }

    public double getOrbitalPeriod()
    {
        return orbitalPeriod;
    }

    public Set<CosmicObject> getSatellites()
    {
        return new HashSet<>(this.satellites);
    }
}
