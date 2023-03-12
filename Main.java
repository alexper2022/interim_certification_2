package Task2;

import Task2.models.GameMachine;
import Task2.models.Toys;
import Task2.models.ToysWin;
import Task2.models.WinToys;
import Task2.service.FileInOut;
import Task2.ui.MainMenu;

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

