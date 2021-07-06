package personExtended;

public class app {

	public static void main(String[] args) {

		personManager person = new personManager();
		person.addperson(new person("katie", 43, "job"));
		person.addperson(new person("eva", 42, "job"));

		person.print();

		personManager mypet = new personManager();
		mypet.addpet(new cat("mittins", 3, "white", false));
		mypet.addpet(new cat("fluffy", 50, "black", false));
		mypet.addpet(new dog("floppy", 3, "white-bagie", "boxer"));
		mypet.addpet(new dog("paws", 5, "black", "poodle"));

		mypet.petprint();

		personManager charlotte = new personManager();
		charlotte.addAnimalperson(new person("charlotte", 18, "apprentice"));
		charlotte.addpet(new dog("lily", 3, "brown", "cockapoo"));
		charlotte.addpet(new cat("mittins", 7, "black", true));

		charlotte.AnimalPrint();
	}

}
