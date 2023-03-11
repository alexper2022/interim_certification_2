package Task22;

import Task22.models.GameMachine;
import Task22.models.Toys;
import Task22.models.ToysWin;
import Task22.models.WinToys;
import Task22.service.FileInOut;
import Task22.ui.MainMenu;

import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {

		ArrayList<Toys> toys = new ArrayList<Toys>();
		GameMachine machine = new GameMachine(toys);
		ArrayList<ToysWin> winToys = new ArrayList<ToysWin>();
		WinToys winerToys = new WinToys(winToys);
		FileInOut.readerFileGame(machine);
		FileInOut.readerFileWiner(winerToys);
		MainMenu.RunApp(machine, winerToys);
	}
}

