package Task2.service;

import Task2.models.GameMachine;
import Task2.models.Toys;
import Task2.models.ToysWin;
import Task2.models.WinToys;
import Task2.viewer.Viewer;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Random;

public class GameToy {
    public static void lottery(GameMachine machine, WinToys winerToys) {
        ArrayList<Integer> allId = new ArrayList<Integer>();
        // Выбераем id с ненулевым count
        for (Toys toyM : machine.getToys()) {
            if (toyM.getCount() > 0) {
                allId.add(toyM.getId());
            }
        }
        Random rnd = new Random();
        int win = rnd.nextInt(0, allId.size());
        int idWin = allId.get(win);
        System.out.println("Вы выиграли:");
        Viewer.viewOne(machine, idWin);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        for (Toys toyM : machine.getToys()) {
            if (toyM.getId() == idWin) {
                ToysWin additionToy2 = new ToysWin(toyM.getId(), toyM.getName(), 1, toyM.getFrequencyOfLoss(), timestamp.toString());
                winerToys.getToys().add(additionToy2);
                toyM.setCount(toyM.getCount() - 1);
            }
        }
        FileInOut.writerWiner(winerToys);
        FileInOut.writerGame(machine);
    }
}

