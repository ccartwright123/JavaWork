package personExtended;

import java.util.ArrayList;

public class cat {

	public String name;
	public int age;
	public String colour;
	public ArrayList<cat> mycats = new ArrayList<cat>();

	public cat(String name, int age, String colour) {
		this.name = name;
		this.age = age;
		this.colour = colour;
	}

	public void speak() {
		System.out.println("meow");
	}

	public void print() {
		System.out.print("Name: ");
		System.out.println(this.name);
		System.out.print("Age: ");
		System.out.println(this.age);
		System.out.print("Job: ");
		System.out.println(this.colour);
	}

}
