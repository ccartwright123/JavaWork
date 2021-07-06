package personExtended;

public class cat extends pet {

	private boolean indoor;

	public cat(String name, int age, String colour, boolean indoor) {
		super(name, age, colour);
		setIndoor(indoor);
	}

	public void setIndoor(boolean indoor) {
		this.indoor = indoor;
	}

	public boolean getIndoor() {
		return this.indoor;
	}

	@Override
	public void speak() {
		System.out.println("meow");
	}

}
