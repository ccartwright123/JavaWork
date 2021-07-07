package garageTask;

public class Lorry extends Vehicle {
	private int cargo;

	public Lorry(int id, String make, int cargo) {
		super(id, make);
		setCargo(cargo);
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}

	public int getCargo() {
		return this.cargo;
	}

	public void changeType() {
		setType("Lorry");
	}

	@Override
	public void currentPrint() {
		System.out.println("ID: ");
		System.out.println(getId());
		System.out.println("Make/Model: ");
		System.out.println(getMake());
		changeType();
		System.out.println("Type: ");
		System.out.println(getType());
		System.out.println("Amount Of Cargo: ");
		System.out.println(getCargo());
	}
}
