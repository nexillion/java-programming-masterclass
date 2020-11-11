package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player implements SaveAble
{
    private String playerName;
    private int maxHitPoints;
    private int maxCarriedWeight;
    private String equippedWeapon;

    public Player(String playerName, int maxHitPoints, int maxCarriedWeight, String equippedWeapon)
    {
        this.playerName = playerName;
        this.maxHitPoints = maxHitPoints;
        this.maxCarriedWeight = maxCarriedWeight;
        this.equippedWeapon = equippedWeapon;
    }

    @Override
    public String toString() // This is paste here just for an example of what intellij can do
    {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", maxHitPoints=" + maxHitPoints +
                ", maxCarriedWeight=" + maxCarriedWeight +
                ", equippedWeapon='" + equippedWeapon + '\'' +
                '}';
    }

    @Override
    public ArrayList<String> writeArray()
    {
        ArrayList<String> arrayValues = new ArrayList<>(List.of(this.playerName, String.valueOf(this.maxHitPoints), String.valueOf(this.maxCarriedWeight), this.equippedWeapon));
        return arrayValues;
    }

    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }

    public void setMaxHitPoints(int maxHitPoints)
    {
        this.maxHitPoints = maxHitPoints;
    }

    public void setMaxCarriedWeight(int maxCarriedWeight)
    {
        this.maxCarriedWeight = maxCarriedWeight;
    }

    public void setEquippedWeapon(String equippedWeapon)
    {
        this.equippedWeapon = equippedWeapon;
    }
}
