package Task22.service;

import Task22.models.GameMachine;
import Task22.models.Toys;

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
