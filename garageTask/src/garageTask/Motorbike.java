package garageTask;

public class Motorbike extends Vehicle {

	private boolean CBT;

	public Motorbike(int id, String make, boolean CBT) {
		super(id, make);
		setCBT(CBT);
	}

	public void setCBT(boolean CBT) {
		this.CBT = CBT;
	}

	public boolean getCBT() {
		return this.CBT;
	}

	public void changeType() {
		setType("Motorbike");
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
		System.out.println("Has CBT Check: ");
		System.out.println(getCBT());
	}
}
