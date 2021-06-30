package operators;

public class App {

	public static void main(String[] args) {

		System.out.println("Physics Result: " + ScienceExams.physicsResult);

		System.out.println("\nChemistry Result: " + ScienceExams.chemistryResult);

		System.out.println("\nBiology Result: " + ScienceExams.biologyResult);

		System.out.println("\nTotal Score: " + ScienceExams.totalScore());

		System.out.println("\nPercentage: " + ScienceExams.getPercentage());

	}

}
