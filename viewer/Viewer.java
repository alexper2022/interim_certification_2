package Task2.viewer;

import Task2.models.GameMachine;
import Task2.models.Toys;
import Task2.models.WinToys;

public class Viewer {
    public static void viewAllGameToy(GameMachine machine) {
        for (Toys toy : machine.getToys()) {
            if (toy.getCount() != 0) {
                System.out.println(toy);
            }
        }
    }

    public static void viewOne(GameMachine machine, int id) {
        for (Toys toy : machine.getToys()) {
            if (toy.getId() == id) {
                System.out.println(toy);
            }
        }
    }

    public static void viewAllWinerToy(WinToys viewing) {
        for (Toys toy : viewing.getToys()) {
            System.out.println(toy);
        }
    }
}
