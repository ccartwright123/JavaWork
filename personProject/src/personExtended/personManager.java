package personExtended;

import java.util.ArrayList;

public class personManager {

	private ArrayList<pet> pets = new ArrayList<pet>();
	private ArrayList<person> people = new ArrayList<person>();

	public boolean addperson(person person) {
		return this.people.add(person);
	}

	public boolean addpet(pet pet) {
		return this.pets.add(pet);
	}

	public person getPerson(int index) {
		return this.people.get(index);
	}

	public pet getPet(int index) {
		return this.pets.get(index);
	}

	public void print() {
		for (int i = 0; i < this.people.size(); i++) {
			this.getPerson(i).personprint();
		}

	}

	private ArrayList<person> animalPeople = new ArrayList<person>();

	public boolean addAnimalperson(person person) {
		return this.animalPeople.add(person);
	}

	public person getAnimalPerson(int index) {
		return this.animalPeople.get(index);
	}

	public void AnimalPrint() {
		for (int i = 0; i < this.animalPeople.size(); i++) {
			this.getAnimalPerson(i).print();

		}
	}

	public void petprint() {
		for (int i = 0; i < this.pets.size(); i++) {
			this.getPet(i).print();
		}

	}

}
