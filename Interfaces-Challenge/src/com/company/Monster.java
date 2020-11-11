package com.company;

import java.util.ArrayList;
import java.util.List;

public class Monster implements SaveAble
{
    private String monsterName;
    private int maxHitPoints;
    private int size;

    public Monster(String name, int maxHitPoints, int size)
    {
        this.monsterName = name;
        this.maxHitPoints = maxHitPoints;
        this.size = size;
    }

    @Override
    public ArrayList<String> writeArray()
    {
        ArrayList<String> arrayValues = new ArrayList<>(List.of(this.monsterName, String.valueOf(this.maxHitPoints), String.valueOf(this.size)));
        return arrayValues;
    }
}
