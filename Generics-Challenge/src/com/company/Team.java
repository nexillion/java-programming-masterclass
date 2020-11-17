package com.company;

import java.util.ArrayList;

public class Team <T extends Player> implements Comparable <Team<T>> // Comparable is an in-built java interface
{
    private String teamName;
    int gamesPlayed;
    int gamesWon;
    int gamesLost;
    int gamesTied;

    ArrayList<T> teamMembers = new ArrayList<>();

    public Team(String teamName)
    {
        this.teamName = teamName;
    }

    public boolean addPlayerToTeam(T player)
    {
       if(teamMembers.contains(player))
       {
           System.out.println(player.getPlayerName() + " is already on the team.");
           return false;
       }

       teamMembers.add(player);
        System.out.println(player.getPlayerName() + " added to team " + this.teamName + ".");
       return true;
    }

    public int numPlayers()
    {
        return this.teamMembers.size();
    }

    public void matchResult(Team<T> opponentTeam, int teamScore, int opponentScore)
    {
        String message;

        if(teamScore > opponentScore)
        {
            gamesWon++;
            message = " beat ";
        }
        else if(teamScore < opponentScore)
        {
            gamesLost++;
            message = " lost to ";
        }
        else
        {
            gamesTied++;
            message = " tied with ";
        }

        gamesPlayed++;

        if(opponentTeam != null) // prevents infinite loop
        {
            System.out.println(this.getTeamName() + message + opponentTeam.getTeamName());
            opponentTeam.matchResult(null, opponentScore, teamScore);
        }
    }

    public int ranking()
    {
        return gamesWon * 2 + gamesPlayed + gamesTied - gamesLost;
    }

    @Override
    public int compareTo(Team<T> team)
    {
        if(this.ranking() > team.ranking())
        {
            return -1;
        }
        else if(this.ranking() < team.ranking())
        {
            return 1;
        }
        return 0;
    }

    public String getTeamName()
    {
        return teamName;
    }
}
