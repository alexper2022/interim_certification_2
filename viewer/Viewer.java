package Task22.viewer;

import Task22.models.GameMachine;
import Task22.models.Toys;
import Task22.models.WinToys;

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
