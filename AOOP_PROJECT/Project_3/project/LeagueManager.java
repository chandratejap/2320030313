package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class LeagueManager {
    private List<Player> players = new ArrayList<>();

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void displayPlayers() {
        for (Player player : players) {
            System.out.println(player);
        }
    }

    public void sortByDefault() {
        Collections.sort(players);
    }

    public void sortByAge() {
        players.sort(new PlayerAgeComparator());
    }

    public void sortByGoals() {
        players.sort(new PlayerGoalsComparator());
    }

    public void sortByAssists() {
        players.sort(new PlayerAssistsComparator());
    }

    public Player clonePlayer(Player player) {
        return player.clone();
    }

    public Iterator<Player> getPlayerIterator() {
        return new PlayerIterator(players);
    }
}
