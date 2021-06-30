package ExamResults;

public class resultCal {

	public static int biology = 130;
	public static int chemistry = 125;
	public static int physics = 100;
	public static int result = 0;
	public static double percentage = 0;
	public static String strBiology = Integer.toString(biology);
	public static String strChemistry = Integer.toString(chemistry);
	public static String strPhysics = Integer.toString(physics);

	public static String result() {
		result = result + biology + chemistry + physics;
		String strResult = Integer.toString(result);
		return strResult;
	}

	public static String percentageFun() {
		percentage = percentage + (biology + chemistry + physics) * 100 / 450;
		String strPercentage = Double.toString(percentage);
		return strPercentage;
	}

}
