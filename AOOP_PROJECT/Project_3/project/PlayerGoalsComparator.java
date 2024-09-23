package project;

import java.util.Comparator;

class PlayerGoalsComparator implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        return Integer.compare(p2.getGoals(), p1.getGoals()); 
    }
}