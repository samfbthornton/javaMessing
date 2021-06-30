package operators;

public class ScienceExams {

	public static void method1() {

		double physicsResult = 102;
		double chemistryResult = 148;
		double biologyResult = 47;
		double total = physicsResult + chemistryResult + biologyResult;

		System.out.println("Physics Result: " + physicsResult);
		System.out.println("Chemistry Result: " + chemistryResult);
		System.out.println("Biology Result: " + biologyResult);
		System.out.println("TOTAL SCORE: " + total);

	}

	public static void method2() {

		double physicsResult = 102;
		double chemistryResult = 148;
		double biologyResult = 47;
		double total = physicsResult + chemistryResult + biologyResult;
		double percentage = (total * 100) / 450;

		System.out.println("PERCENTAGE: " + percentage + "%");
	}

	public static void main(String[] args) {
		method1();
		method2();

	}
}
