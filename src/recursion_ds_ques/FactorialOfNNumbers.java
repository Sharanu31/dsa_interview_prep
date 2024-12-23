package recursion_ds_ques;

public class FactorialOfNNumbers {

	public static void main(String[] args) {
		int m = 5;
		System.out.println(factorialOnNumber(m));

	}

	private static int factorialOnNumber(int m) {
		if (m == 1)
			return 1;
		return m * factorialOnNumber(m - 1);
	}

}
