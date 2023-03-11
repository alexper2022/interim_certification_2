package Task22.service;

import Task22.models.GameMachine;
import Task22.models.Toys;

import java.util.ArrayList;

import static Task22.service.UserInput.user_in;


public class AddToy {
	public static void addToy(GameMachine machine) {

		ArrayList<Toys> toysInMachine = machine.getToys();
		int id = LastId.lastId(machine) + 1;
		System.out.println("Идентификатор: " + id);
		System.out.print("Введите название игрушки: ");
		String name = user_in().nextLine();
		System.out.print("Введите количество игрушек: ");
		int count = user_in().nextInt();
		System.out.print("Введите процент выпадения игрушки: ");
		float frequencyOfLoss = user_in().nextFloat();
		Toys toy = new Toys(id, name, count, frequencyOfLoss);
		System.out.println("\nБудет добавлена игрушка:\n" + toy + "\n");
		toysInMachine.add(toy);
		FileInOut.writerGame(machine);
	}
}
