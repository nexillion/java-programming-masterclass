package com.company;

public abstract class Player
{
    protected String playerName;

    public Player(String playerName)
    {
        this.playerName = playerName;
    }

    public String getPlayerName()
    {
        return playerName;
    }
}
