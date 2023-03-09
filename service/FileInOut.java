package Task2.service;

import Task2.models.GameMachine;
import Task2.models.Toys;
import Task2.models.WinToys;

import java.io.FileWriter;
import java.util.Formatter;

public class FileInOut {

    public static void writerWiner(WinToys toys) {
        Formatter f = new Formatter();
        for (Toys toy : toys.getToys()) {
            f.format("%d;%s;%d;%.2f\n", toy.getId(), toy.getName(), toy.getCount(), toy.getFrequencyOfLoss());
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
}
