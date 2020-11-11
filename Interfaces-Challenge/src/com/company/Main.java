package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Player player = new Player("Default", 10, 10, "Default");
        System.out.println(player.toString());

        saveObject(player);
        System.out.println("\n");

        player.setPlayerName("Nikolay");
        player.setMaxHitPoints(30);
        player.setMaxCarriedWeight(50);
        player.setEquippedWeapon("Sword");

        saveObject(player);
        System.out.println("\n");

        Monster monster = new Monster("Slime", 10, 5);
        saveObject(monster);
    }

    public static void saveObject(SaveAble objectToSave)
    {
        for(int i = 0; i < objectToSave.writeArray().size(); i++)
        {
            System.out.println((i + 1) + ". " + objectToSave.writeArray().get(i));
        }
    }
}
