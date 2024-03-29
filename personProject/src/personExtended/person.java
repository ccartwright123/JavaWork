package personExtended;

public class person {

	private String name;
	private int age;
	private String job;

	public person() {

	}

	public person(String name, int age, String job) {
		setName(name);
		setAge(age);
		setColour(job);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if (age > 0 && age < 120) {
			this.age = age;
		} else {
			System.out.println("Invalid age");
		}
	}

	public void setColour(String colour) {
		this.job = colour;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getColour() {
		return job;
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
