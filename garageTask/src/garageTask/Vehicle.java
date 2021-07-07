package garageTask;

public abstract class Vehicle {

	private int id;
	private String make;
	private String type;
	private int cost;
	private int extraCost;

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

	public void setCost() {
		this.cost = 1000;
	}

	public void setExtraCost(int extraCost) {
		this.extraCost = extraCost;
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

	public int getCost() {
		return this.cost;
	}

	public int getExtraCost() {
		return this.extraCost;
	}

	public abstract void currentPrint();

	public abstract void changeExtraCost();

	public void billPrint() {
		changeExtraCost();
		setCost();
		System.out.println("id: ");
		System.out.println(getId());
		System.out.println("Total cost: ");
		System.out.println(getCost() + getExtraCost());
	}
}
