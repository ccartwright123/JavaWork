package personExtended;

public class app {

	public static void main(String[] args) {

		personManager person = new personManager();
		person.addperson(new person("katie", 43, "job"));
		person.addperson(new person("eva", 42, "job"));

		person.print();

		person mycat = new person();
		mycat.addcat(new cat("mittins", 3, "white"));
		mycat.addcat(new cat("fluffy", 5, "black"));

		mycat.catprint();

		person mydog = new person();
		mydog.adddog(new dog("floppy", 3, "white-bagie"));
		mydog.adddog(new dog("paws", 5, "black"));

		mydog.dogprint();

		person charlotte = new person();
		charlotte.addAnimalperson(new person("charlotte", 18, "apprentice"));
		charlotte.adddog(new dog("lily", 3, "brown"));
		charlotte.addcat(new cat("mittins", 7, "black"));

		charlotte.AnimalPrint();
	}

}
