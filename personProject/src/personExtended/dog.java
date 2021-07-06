package personExtended;

public class dog {

	public String name;
	public int age;
	public String colour;

	public dog(String name, int age, String colour) {
		this.name = name;
		this.age = age;
		this.colour = colour;
	}

	public void speak() {
		System.out.println("woof");
	}

	public void print() {
		System.out.print("Name: ");
		System.out.println(this.name);
		System.out.print("Age: ");
		System.out.println(this.age);
		System.out.print("Colour: ");
		System.out.println(this.colour);
	}
}
