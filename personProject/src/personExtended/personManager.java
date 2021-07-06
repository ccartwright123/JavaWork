package personExtended;

import java.util.ArrayList;

public class personManager {

	public ArrayList<person> people = new ArrayList<person>();

	public boolean addperson(person person) {
		return this.people.add(person);
	}

	public person getPerson(int index) {
		return this.people.get(index);
	}

	public void print() {
		for (int i = 0; i < this.people.size(); i++) {
			this.getPerson(i).personprint();
		}

	}

}
