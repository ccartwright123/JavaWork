package personExtended;

public class pet {

	private String name;
	private int age;
	private String colour;

	public pet(String name, int age, String colour) {
		super();
		setName(name);
		setAge(age);
		setColour(colour);
	}

	public pet() {

	}

	public void speak() {
		System.out.println("im a pet");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if (age > 0 && age < 20) {
			this.age = age;
		} else {
			System.out.println("Invalid age");
		}
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getColour() {
		return colour;
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
