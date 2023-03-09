package Task2.ui;

import Task2.models.GameMachine;
import Task2.models.WinToys;
import Task2.service.*;
import Task2.viewer.Viewer;


public class MainMenu {
	public static void RunApp(GameMachine machine, WinToys winerToys) {
		try {
			System.out.println("+------------------------------------------+");
			System.out.println("|                   МЕНЮ                   |");
			System.out.println("+------------------------------------------+");
			System.out.println("| 1. Вывести список игрушек для розыгрыша. |");
			System.out.println("|------------------------------------------|");
			System.out.println("| 2. Вывести список разыгранных игрушек.   |");
			System.out.println("|------------------------------------------|");
			System.out.println("| 3. Изменить процент выпадения игрушки.   |");
			System.out.println("|------------------------------------------|");
			System.out.println("| 4. Провести розыгрыш.                    |");
			System.out.println("|------------------------------------------|");
			System.out.println("| 5. Добавить игрушку.                     |");
			System.out.println("|------------------------------------------|");
			System.out.println("| 6. Удалить игрушку.                      |");
			System.out.println("|------------------------------------------|");
			System.out.println("| 0. Выйти из программы                    |");
			System.out.println("+------------------------------------------+");
			System.out.print("Выберите пункт меню: ");
			switch (UserInput.user_in().nextInt()) {
				case (1):
					System.out.println("\n-=< Вывести список игрушек для розыгрыша >=-\n");
					System.out.println("Игрушки в игре:");
					Viewer.viewAllGameToy(machine);
					RunApp(machine, winerToys);
				case (2):
					System.out.println("\n-=< Вывести список разыгранных игрушек >=-\n");
					System.out.println("Разыгранные игрушки:");
					Viewer.viewAllWinerToy(winerToys);
					RunApp(machine, winerToys);
				case (3):
					System.out.println("\n-=< Изменить процент выпадения игрушки >=-\n");
					System.out.print("Введите идентификатор игрушки: ");
					int idToy = UserInput.user_in().nextInt();
					Viewer.viewOne(machine, idToy);
					System.out.print("Процент выпадения игрушки: ");
					float frequencyOfLoss = (UserInput.user_in().nextInt());
					EditToy.editToyFrequency(machine, idToy, frequencyOfLoss);
					RunApp(machine, winerToys);
				case (4):
					System.out.println("\n-=< Провести розыгрыш >=-\n");
					GameToy.lottery(machine, winerToys);
					RunApp(machine, winerToys);
				case (5):
					System.out.println("\n-=< Добавить игрушку >=-\n");
					AddToy.addToy(machine);
					RunApp(machine, winerToys);
				case (6):
					System.out.println("\n-=< Удалить игрушку >=-\n");
					System.out.print("Введите идентификатор удаляемой игрушки: ");
					int id = UserInput.user_in().nextInt();
					DeleteToy.delToy(machine, id);
					System.out.println("Игрушка с идентификатором " + id + " успешно удалена!");
					RunApp(machine, winerToys);
				case (0):
					System.out.println("\n-=< Выйти из программы >=-\n");
					System.out.println("Спасибо, что играли с нами!");
					UserInput.user_in().close();
					System.exit(0);
				default:
					System.out.println("\nВы ошиблись при вводе!\nБудьте внимательны!\n");
					RunApp(machine, winerToys);
			}
		} catch (Exception e) {
			RunApp(machine, winerToys);
		}

	}
}
