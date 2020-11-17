package com.company;

public class Main
{
    public static void main(String[] args)
    {
        League<Team<Football>> footballLeague = new League<>("AFL");
        Team<Football> adelaideCrows = new Team<>("Adelaide Crows");
        Team<Football> melbourne = new Team<>("Melbourne");
        Team<Football> hawthorn= new Team<>("Hawthorn");
        Team<Football> fremantle= new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);
        adelaideCrows.matchResult(fremantle, 2, 1);

        footballLeague.addTeamToLeague(adelaideCrows);
        footballLeague.addTeamToLeague(melbourne);
        footballLeague.addTeamToLeague(hawthorn);
        footballLeague.addTeamToLeague(fremantle);
        footballLeague.showLeagueTable();
    }
}
