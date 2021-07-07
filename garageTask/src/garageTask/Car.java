package garageTask;

public class Car extends Vehicle {

	private int passangers;

	public Car(int id, String make, int passangers) {
		super(id, make);
		setPassangers(passangers);
	}

	public void setPassangers(int passangers) {
		this.passangers = passangers;
	}

	public int getPassangers() {
		return this.passangers;
	}

	public void changeType() {
		setType("car");
	}

	@Override
	public void changeExtraCost() {
		if (getPassangers() < 3) {
			setExtraCost(300);
		} else if (getPassangers() < 5) {
			setExtraCost(600);
		} else {
			setExtraCost(900);
		}
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
		System.out.println("Amount Of Passangers: ");
		System.out.println(getPassangers());
	}

}
