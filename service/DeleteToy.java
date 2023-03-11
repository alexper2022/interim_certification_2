package Task22.service;

import Task22.models.GameMachine;
import Task22.models.Toys;

import java.util.ArrayList;

public class DeleteToy {
	public static void delToy(GameMachine machine, int id) {
		ArrayList<Toys> toys = machine.getToys();
		Toys toy;
		for (int i = 0; i < toys.size(); i++) {
			toy = toys.get(i);
			if (toy.getId() == id) {
				toys.remove(i);
			}
		}
		FileInOut.writerGame(machine);
	}
}
