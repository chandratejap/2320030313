package project;

import java.util.Comparator;

class PlayerAssistsComparator implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        return Integer.compare(p2.getAssists(), p1.getAssists());
    }
}