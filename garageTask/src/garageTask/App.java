package garageTask;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Garage help = new Garage();
		help.addVehicle(new Car(24423423, "2004pigeot", 7));
		help.addVehicle(new Motorbike(2534523, "Harly", true));
		help.addVehicle(new Lorry(25, "2004run", 700));

		help.Print();
		help.listCost();

		help.removeID(25);
		help.removeType("Motorbike");

	}

}
