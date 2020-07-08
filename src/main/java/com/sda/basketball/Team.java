package com.sda.basketball;

import java.math.BigDecimal;
import java.util.*;


public class Team {

    HashSet<Player> players = new HashSet<>();

    void showTeam() {
        Iterator<Player> iterator = players.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    void addplayer(String firstName, String lastName, int height, BigDecimal salary) {
        players.add(new Player(firstName, lastName, height, salary));
    }

    void deletePlayer(String firstName, String lastName, int height, BigDecimal salary) {
        Player player = new Player(firstName, lastName, height, salary);
        players.remove(player);
    }

    void showTeamFromShortest() {
        List<Player> playersList = new ArrayList<>(players);
        Collections.sort(playersList, new ComparatorByHeihgtFromLowest());
        System.out.println(playersList);
    }

    void showTeamFromShortest1() {
        List<Player> playersList = new ArrayList<>(players);
        Collections.sort(playersList);
        System.out.println(playersList);
    }

    void showTeamFromHighest() {
        List<Player> playersList = new ArrayList<>(players);
        Collections.sort(playersList, new ComparatorByHeihgtFromLowest().reversed());
        System.out.println(playersList);
    }

    void showTeamFromHighest1() {
        List<Player> playersList = new ArrayList<>(players);
        Collections.sort(playersList, Comparator.reverseOrder());
        System.out.println(playersList);
    }

    void showPlayersBySalary() {
        System.out.println("Players by salary");
        List<Player> playersList = new ArrayList<>(players);
        playersList.sort(new ComparatorBySalary());
        System.out.println(playersList);
    }

    String highestSalary() {
        List<Player> playersList = new ArrayList<>(players);
        playersList.sort(new ComparatorBySalary());
        System.out.print("Biggest salary in team is: ");
        return playersList.get(playersList.size() - 1).salary.toString();
    }




}
