package Task2.ui;

import static Task2.service.FileInOut.user_in;

public class MainMenu {
    public static void RunApp() {
        try {
            System.out.println("1. Вывести список игрушек для розыгрыша.");
            System.out.println("2. Вывести список разыгранных игрушек.");
            System.out.println("3. Изменить параметры игрушки.");
            System.out.println("4. Провести розыгрыш.");
            System.out.println("5. Добавить игрушку.");
            System.out.println("6. Удалить игрушку.");
            System.out.println("0. Выйти из программы");
            System.out.print("Выберите пункт меню: ");
            switch (user_in().nextInt()) {
                case (1):
                    System.out.println("\n1. Вывести список игрушек для розыгрыша.\n");
                    RunApp();
                case (2):
                    System.out.println("\n2. Вывести список разыгранных игрушек.\n");
                    RunApp();
                case (3):
                    System.out.println("\n3. Изменить параметры игрушки.\n");
                    RunApp();
                case (4):
                    System.out.println("\n4. Провести розыгрыш.\n");
                    RunApp();
                case (5):
                    System.out.println("\n5. Добавить игрушку.\n");
                    RunApp();
                case (6):
                    System.out.println("\n6. Удалить игрушку.\n");
                    RunApp();
                case (0):
                    System.out.println("\n0. Выйти из программы.\n");
                    System.out.println("Спасибо, что играли с нами!");
                    user_in().close();
                    System.exit(0);
                default:
                    System.out.println("\nВы ошиблись при вводе!\nБудьте внимательны!\n");
                    RunApp();
            }
        } catch (Exception e) {
            MainMenu.RunApp();
        }

    }
}
