package Task2;

import Task2.models.GameMachine;
import Task2.models.Toys;
import Task2.ui.MainMenu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Toys doll1 = new Toys(1, "Кукла Маша", 5, 20);
        Toys doll2 = new Toys(2, "Кукла Даша", 5, 20);
        Toys doll3 = new Toys(3, "Кукла Саша", 5, 20);
        Toys designer1 = new Toys(4, "Конструктор малый", 5, 30);
        Toys designer2 = new Toys(5, "Конструктор средний", 5, 30);
        Toys designer3 = new Toys(6, "Конструктор большой", 5, 30);
        Toys teddyBear1 = new Toys(7, "Медвежонок маленький", 5, 50);
        Toys teddyBear2 = new Toys(8, "Медвежонок средний", 5, 50);
        Toys teddyBear3 = new Toys(9, "Медвежонок большой", 5, 50);
        ArrayList<Toys> toys = new ArrayList<Toys>();
        GameMachine machine = new GameMachine(toys);
        toys.add(doll1);
        toys.add(doll2);
        toys.add(doll3);
        toys.add(designer1);
        toys.add(designer2);
        toys.add(designer3);
        toys.add(teddyBear1);
        toys.add(teddyBear2);
        toys.add(teddyBear3);
        MainMenu.RunApp(machine);
    }
}

