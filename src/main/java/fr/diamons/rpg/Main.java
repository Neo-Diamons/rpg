package fr.diamons.rpg;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Player", 100, 10, 1);
        Place currentPlace = new Town("Town");

        currentPlace.addDestination(new Dungeon("Forest"));
        currentPlace.addDestination(new Dungeon("Cave"));
        currentPlace.addDestination(new Dungeon("River"));
        currentPlace.addDestination(new Dungeon("Mountain"));

        while (currentPlace != null) {
            currentPlace = currentPlace.chooseChoice(player);
        }
    }
}
