package personExtended;

import java.util.ArrayList;

public class person {

	public String name;
	public int age;
	public String job;

	public ArrayList<cat> mycats = new ArrayList<cat>();

	public ArrayList<dog> mydogs = new ArrayList<dog>();

	public person() {

	}

	public person(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}

	public ArrayList<person> animalPeople = new ArrayList<person>();

	public boolean addAnimalperson(person person) {
		return this.animalPeople.add(person);
	}

	public person getAnimalPerson(int index) {
		return this.animalPeople.get(index);
	}

	public void AnimalPrint() {
		for (int i = 0; i < this.animalPeople.size(); i++) {
			this.getAnimalPerson(i).print();
			this.dogprint();
			this.catprint();
		}
	}

	public void addcat(cat cat) {
		this.mycats.add(cat);
	}

	public void adddog(dog dog) {
		this.mydogs.add(dog);
	}

	public cat getcat(int index) {
		return this.mycats.get(index);
	}

	public void catprint() {
		for (int i = 0; i < this.mycats.size(); i++) {
			this.getcat(i).print();
		}

	}

	public dog getdog(int index) {
		return this.mydogs.get(index);
	}

	public void dogprint() {
		for (int i = 0; i < this.mydogs.size(); i++) {
			this.getdog(i).print();
		}

	}

	public void personprint() {
		System.out.print("Name: ");
		System.out.println(this.name);
		System.out.print("Age: ");
		System.out.println(this.age);
		System.out.print("Job: ");
		System.out.println(this.job);
	}

	public void print() {
		System.out.print("Name: ");
		System.out.println(this.name);
		System.out.print("Age: ");
		System.out.println(this.age);
		System.out.print("Job: ");
		System.out.println(this.job);
	}
}
