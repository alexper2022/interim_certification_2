package Task2.models;

import java.util.ArrayList;

public class WinToys {
	private ArrayList<Toys> toys = new ArrayList<Toys>();

	public WinToys(ArrayList<Toys> toys) {
		this.toys = toys;
	}

	@Override
	public String toString() {
		System.out.println("Выигранные игрушки:\n");
		return null;
	}

	public ArrayList<Toys> getToys() {
		return toys;
	}

	public void setToys(ArrayList<Toys> toys) {
		this.toys = toys;
	}

	public void addToys(WinToys winToys, int id, String name, float procent) {
		Toys newToy = new Toys(id, name, 1, procent);
		winToys.getToys().add(newToy);
	}

}
