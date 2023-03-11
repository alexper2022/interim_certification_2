package Task22.service;

import Task22.models.GameMachine;
import Task22.models.Toys;
import Task22.models.ToysWin;
import Task22.models.WinToys;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class FileInOut {

	public static void writerWiner(WinToys toys) {

		Formatter f = new Formatter();
		for (ToysWin toy : toys.getToys()) {
			f.format("%d;%s;%d;%.2f\n", toy.getId(), toy.getName(), toy.getCount(), toy.getFrequencyOfLoss(), toy.getDataTime());
		}
		try {
			FileWriter fw = new FileWriter("WinToys.csv", false);
			fw.write(String.valueOf(f));
			fw.flush();
			fw.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	public static void writerGame(GameMachine toys) {
		Formatter f = new Formatter();
		for (Toys toy : toys.getToys()) {
			f.format("%d;%s;%d;%.2f\n", toy.getId(), toy.getName(), toy.getCount(), toy.getFrequencyOfLoss());
		}
		try {
			FileWriter fw = new FileWriter("GameToys.csv", false);
			fw.write(String.valueOf(f));
			fw.flush();
			fw.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	public static void readerFileWiner(WinToys toys) {
		List<String> result = null;
		try {
			result = Files.readAllLines(Path.of("WinToys.csv"));
		} catch (IOException ex) {
			System.out.println(ex);
		}
		ArrayList<ToysWin> winToys = toys.getToys();
		ToysWin toy = null;
		ArrayList<List> temp = new ArrayList<>();
		for (String line : result) {
			temp.add(List.of(line.split(";")));
			for (List el : temp) {
				int id = Integer.parseInt((String) el.get(0));
				String name = el.get(1).toString();
				int count = Integer.parseInt((String) el.get(2));
				String frequency = ((String) el.get(3)).replace(",", ".");
				float frequencyOfLoss = Float.parseFloat(frequency);
				String dateTime = el.get(4).toString();
				toy = new ToysWin(id, name, count, frequencyOfLoss, dateTime);
			}
			winToys.add(toy);
		}
	}

	public static void readerFileGame(GameMachine gameMachine) {
		List<String> result = null;
		try {
			result = Files.readAllLines(Path.of("GameToys.csv"));
		} catch (IOException ex) {
			System.out.println(ex);
		}
		ArrayList<Toys> machine = gameMachine.getToys();
		Toys toy = null;
		ArrayList<List> temp = new ArrayList<>();
		for (String line : result) {
			temp.add(List.of(line.split(";")));
			for (List el : temp) {
				int id = Integer.parseInt((String) el.get(0));
				String name = el.get(1).toString();
				int count = Integer.parseInt((String) el.get(2));
				String frequency = ((String) el.get(3)).replace(",", ".");
				float frequencyOfLoss = Float.parseFloat(frequency);
				toy = new Toys(id, name, count, frequencyOfLoss);
			}
			machine.add(toy);
		}
	}
}
