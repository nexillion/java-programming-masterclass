package com.company;

public class Closets
{
    private int jackets;
    private int shoes;
    private int shirts;
    private int motorbikeEquipment;

    public Closets(int jackets, int shoes, int shirts, int motorbikeEquipment)
    {
        this.jackets = jackets;
        this.shoes = shoes;
        this.shirts = shirts;
        this.motorbikeEquipment = motorbikeEquipment;
    }

    public int howFullIsTheCloset()
    {
        return this.jackets + this.shirts + this.shoes + this.motorbikeEquipment;
    }

    private int getJackets()
    {
        return jackets;
    }

    private int getShoes()
    {
        return shoes;
    }

    private int getShirts()
    {
        return shirts;
    }

    private int getMotorbikeEquipment()
    {
        return motorbikeEquipment;
    }

    private void setJackets(int jackets)
    {
        this.jackets = jackets;
    }

    private void setShoes(int shoes)
    {
        this.shoes = shoes;
    }

    private void setShirts(int shirts)
    {
        this.shirts = shirts;
    }

    private void setMotorbikeEquipment(int motorbikeEquipment)
    {
        this.motorbikeEquipment = motorbikeEquipment;
    }
}
