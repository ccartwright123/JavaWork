package dogCompetition;

import java.util.ArrayList;

public class DoggoCompetition {

	ArrayList<String> placement = new ArrayList<String>();

	public String place(int num) {
		if (num > 100) {
			return "error";
		} else {
			for (int i = 1; i < 101; i++) {
				String a = Integer.toString(i);
				if (i == num) {

				} else if (1 == i % 10) {
					placement.add(a + "st");
				} else if (2 == i % 10) {
					placement.add(a + "nd");
				} else if (3 == i % 10) {
					placement.add(a + "rd");
				} else {
					placement.add(a + "th");
				}

			}
			String str = "";
			// for (int b = 0; b < placement.size(); b++) {
			str = placement + "";
			// }
			return str;

		}

	}

}
