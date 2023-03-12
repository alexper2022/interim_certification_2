package Task2.models;

import java.util.ArrayList;

public class GameMachine {
    private ArrayList<Toys> toys = new ArrayList<Toys>();

    public GameMachine(ArrayList<Toys> toys) {
        this.toys = toys;
    }

    @Override
    public String toString() {
        System.out.println("Игрушки для лотереи:\n");
        return null;
    }

    public ArrayList<Toys> getToys() {
        return toys;
    }

    public void setToys(ArrayList<Toys> toys) {
        this.toys = toys;
    }

}
