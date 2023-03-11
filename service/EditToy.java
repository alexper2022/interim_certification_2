package Task22.service;

import Task22.models.GameMachine;
import Task22.models.Toys;

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
