package com.sda.basketball;

import java.math.BigDecimal;

public class TeamApp {
    public static void main(String[] args) {
        Team team = new Team();

        team.addplayer("Michał", "Kowalski", 203, new BigDecimal("1250000"));
        team.addplayer("Łukasz", "Nowak", 212, new BigDecimal("2450950"));
        team.addplayer("Maciej", "Zalewski", 199, new BigDecimal("22950000"));
        team.showTeam();
        System.out.println();
//        team.deletePlayer("Łukasz", "Nowak", 212);
        team.showTeam();

        System.out.println();
        team.showTeamFromShortest();
        team.showTeamFromHighest();
        System.out.println();
        team.showPlayersBySalary();
        System.out.println(team.highestSalary());


    }
}
