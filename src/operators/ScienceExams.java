package operators;

public class ScienceExams {

	public static int physicsResult = 102;
	public static int chemistryResult = 148;
	public static int biologyResult = 47;
	public static int totalScore = physicsResult + chemistryResult + biologyResult;

	public static int totalScore() {

		int totalScore = physicsResult + chemistryResult + biologyResult;
		return totalScore;
	}

	public static double getPercentage() {

		double getPercentage = (totalScore * 100) / 450;
		return getPercentage;
	}
}