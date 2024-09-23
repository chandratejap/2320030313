package project;

import java.util.Iterator;
import java.util.List;

public class PlayerIterator implements Iterator<Player> {
    private List<Player> players;
    private int currentIndex = 0;

    public PlayerIterator(List<Player> players) {
        this.players = players;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < players.size();
    }

    @Override
    public Player next() {
        return players.get(currentIndex++);
    }
}
