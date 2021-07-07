package garageTask;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public void addVehicle(Vehicle Vehicle) {
		this.vehicles.add(Vehicle);
	}

	public void removeID(int id) {
		for (int i = 0; i < this.vehicles.size(); i++) {
			if (getVehicle(i).getId() == id) {
				this.vehicles.remove(getVehicle(i));
				Print();
				break;
			} else {

			}
		}
		System.out.println("Vehicle no longer exsit");
	}

	public void removeType(String type) {
		for (int i = 0; i < this.vehicles.size(); i++) {
			if (getVehicle(i).getType() == type) {
				this.vehicles.remove(getVehicle(i));
				Print();
			} else {

			}
		}
		System.out.println("Vehicles no longer exsit");
	}

	public Vehicle getVehicle(int index) {
		return this.vehicles.get(index);
	}

	public void Print() {
		for (int i = 0; i < this.vehicles.size(); i++) {
			this.getVehicle(i).currentPrint();
		}

	}

	public void listCost() {
		for (int i = 0; i < this.vehicles.size(); i++) {
			this.getVehicle(i).billPrint();
		}
	}
}
