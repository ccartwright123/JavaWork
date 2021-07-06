package personExtended;

public class dog extends pet {

	private String breed;

	public dog(String name, int age, String colour, String breed) {
		super(name, age, colour);
		setBreed(breed);
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getBreed() {
		return this.breed;
	}

	@Override
	public void speak() {
		System.out.println("woof");
	}

}
