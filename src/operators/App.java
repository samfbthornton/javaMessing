package operators;

public class App {

	public static void main(String[] args) {

		System.out.println("Physics Result: ");

		System.out.println(ScienceExams.physicsResult);

		System.out.println("\nChemistry Result: ");

		System.out.println(ScienceExams.chemistryResult);

		System.out.println("\nBiology Result: ");

		System.out.println(ScienceExams.biologyResult);

		System.out.println("\nTotal Score: ");

		System.out.println(ScienceExams.totalScore());

		System.out.println("\nPercentage: ");

		System.out.println(ScienceExams.getPercentage());

	}

}
