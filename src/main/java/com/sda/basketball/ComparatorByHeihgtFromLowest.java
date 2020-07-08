package com.sda.basketball;

import java.util.Comparator;

public class ComparatorByHeihgtFromLowest implements Comparator<Player> {

    @Override
    public int compare(Player p1, Player p2){
        return p1.height - p2.height;
    }
}
