package Task2.viewer;

import Task2.models.GameMachine;
import Task2.models.Toys;

public class Viewer {
    public static void viewAll(GameMachine machine) {
        for (Toys toy : machine.getToys()) {
            System.out.println(toy);
        }
    }

    public static void viewOne(GameMachine machine, int id) {
        for (Toys toy : machine.getToys()) {
            if (toy.getId() == id) {
                System.out.println(toy);
            }
        }
    }
}
