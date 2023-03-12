package Task2.models;

import java.sql.Timestamp;
import java.util.ArrayList;

public class WinToys {
    private ArrayList<ToysWin> toys = new ArrayList<ToysWin>();

    public WinToys(ArrayList<ToysWin> toys) {
        this.toys = toys;
    }

    @Override
    public String toString() {
        System.out.println("Выигранные игрушки:\n");
        return null;
    }

    public ArrayList<ToysWin> getToys() {
        return toys;
    }

    public void setToys(ArrayList<ToysWin> toys) {
        this.toys = toys;
    }

    public void addToys(WinToys winToys, int id, String name, float procent, String dateTime) {
        ToysWin newToy = new ToysWin(id, name, 1, procent, dateTime);
        winToys.getToys().add(newToy);
    }

}
