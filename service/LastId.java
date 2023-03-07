package Task2.service;

import Task2.models.GameMachine;
import Task2.models.Toys;

public class LastId {
    public static int lastId(GameMachine machine) {
        int count = 0;
        for (Toys toy : machine.getToys()) {
            if (toy.getId() > count) {
                count = toy.getId();
            }
        }
        return count;
    }
}
