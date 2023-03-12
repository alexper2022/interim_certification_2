package Task2.service;

import Task2.models.GameMachine;
import Task2.models.Toys;

public class EditToy {
	public static void editToyFrequency(GameMachine machine, int id, float frequencyOfLoss) {
		for (Toys toy : machine.getToys()) {
			if (toy.getId() == id) {
				toy.setFrequencyOfLoss(frequencyOfLoss);
			}
		}
		FileInOut.writerGame(machine);
	}

}
