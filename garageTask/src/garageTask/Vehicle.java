package garageTask;

public abstract class Vehicle {

	private int id;
	private String make;
	private String type;

	public Vehicle(int id, String make) {
		setId(id);
		setMake(make);
	}

	public Vehicle() {

	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return this.id;
	}

	public String getMake() {
		return this.make;
	}

	public String getType() {
		return this.type;
	}

	public abstract void currentPrint();
}
