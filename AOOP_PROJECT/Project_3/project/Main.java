package project;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LeagueManager league = new LeagueManager();

        Player player1 = new Player("John", 25, 10, 5);
        Player player2 = new Player("Paul", 22, 8, 7);
        Player player3 = new Player("Mike", 30, 15, 10);

        league.addPlayer(player1);
        league.addPlayer(player2);
        league.addPlayer(player3);

        System.out.println("Players sorted by name (default):");
        league.sortByDefault();
        league.displayPlayers();

        System.out.println("\nPlayers sorted by age:");
        league.sortByAge();
        league.displayPlayers();

        System.out.println("\nPlayers sorted by goals:");
        league.sortByGoals();
        league.displayPlayers();

        System.out.println("\nIterating through players:");
        Iterator<Player> playerIterator = league.getPlayerIterator();
        while (playerIterator.hasNext()) {
            System.out.println(playerIterator.next());
        }

        System.out.println("\nCloning a player:");
        Player clonedPlayer = league.clonePlayer(player1);
        System.out.println("Original: " + player1);
        System.out.println("Cloned: " + clonedPlayer);
    }
}
