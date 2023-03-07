package Task2.ui;

import Task2.models.GameMachine;
import Task2.service.EditToy;
import Task2.viewer.Viewer;

import static Task2.service.FileInOut.user_in;

public class MainMenu {
    public static void RunApp(GameMachine machine) {
        try {
            System.out.println("+------------------------------------------+\n" +
                    "|                   МЕНЮ                   |\n" +
                    "+------------------------------------------+");
            System.out.println("| 1. Вывести список игрушек для розыгрыша. |");
            System.out.println("|------------------------------------------|");
            System.out.println("| 2. Изменить процент выпадения игрушки.   |");
            System.out.println("|------------------------------------------|");
            System.out.println("| 3. Вывести список разыгранных игрушек.   |");
            System.out.println("|------------------------------------------|");
            System.out.println("| 4. Изменить параметры игрушки.           |");
            System.out.println("|------------------------------------------|");
            System.out.println("| 5. Провести розыгрыш.                    |");
            System.out.println("|------------------------------------------|");
            System.out.println("| 6. Добавить игрушку.                     |");
            System.out.println("|------------------------------------------|");
            System.out.println("| 7. Удалить игрушку.                      |");
            System.out.println("|------------------------------------------|");
            System.out.println("| 0. Выйти из программы                    |");
            System.out.println("+------------------------------------------+");
            System.out.print("Выберите пункт меню: ");
            switch (user_in().nextInt()) {
                case (1):
                    System.out.println("\n-=< Вывести список игрушек для розыгрыша >=-\n");
                    System.out.println("Игрушки в игре:");
                    Viewer.viewAll(machine);
                    RunApp(machine);
                case (2):
                    System.out.println("\n-=< Изменить процент выпадения игрушки >=-\n");
                    System.out.print("Введите идентификатор игрушки: ");
                    int idToy = user_in().nextInt();
                    Viewer.viewOne(machine, idToy);
                    System.out.print("Процент выпадения игрушки: ");
                    float frequencyOfLoss = user_in().nextInt();
                    EditToy.editToy(machine, idToy, frequencyOfLoss);
                    RunApp(machine);
                case (3):
                    System.out.println("\n-=< Вывести список разыгранных игрушек >=-\n");
                    System.out.println("Разыгранные игрушки:");
                    Viewer.viewAll(machine);
                    RunApp(machine);
                case (4):
                    System.out.println("\n-=< Изменить параметры игрушки >=-\n");
                    RunApp(machine);
                case (5):
                    System.out.println("\n-=< Провести розыгрыш >=-\n");
                    RunApp(machine);
                case (6):
                    System.out.println("\n-=< Добавить игрушку >=-\n");
                    RunApp(machine);
                case (7):
                    System.out.println("\n-=< Удалить игрушку >=-\n");
                    RunApp(machine);
                case (0):
                    System.out.println("\n-=< Выйти из программы >=-\n");
                    System.out.println("Спасибо, что играли с нами!");
                    user_in().close();
                    System.exit(0);
                default:
                    System.out.println("\nВы ошиблись при вводе!\nБудьте внимательны!\n");
                    RunApp(machine);
            }
        } catch (Exception e) {
            RunApp(machine);
        }

    }
}
