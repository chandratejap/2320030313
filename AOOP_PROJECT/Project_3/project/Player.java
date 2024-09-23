package project;

import java.util.Objects;

public class Player implements Comparable<Player>, Cloneable {
    private String name;
    private int age;
    private int goals;
    private int assists;

    public Player(String name, int age, int goals, int assists) {
        this.name = name;
        this.age = age;
        this.goals = goals;
        this.assists = assists;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    @Override
    public int compareTo(Player other) {
        return this.name.compareTo(other.name);  // Default sorting by name
    }

    @Override
    public Player clone() {
        try {
            return (Player) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported", e);
        }
    }

    @Override
    public String toString() {
        return String.format("Player{name='%s', age=%d, goals=%d, assists=%d}", name, age, goals, assists);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return age == player.age && goals == player.goals && assists == player.assists && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, goals, assists);
    }
}
