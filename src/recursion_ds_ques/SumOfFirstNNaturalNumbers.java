package recursion_ds_ques;

public class SumOfFirstNNaturalNumbers {

	public static void main(String[] args) {
		int n = 5;
		sumOfNNumber(n, 0);
	}

	private static void sumOfNNumber(int n, int m) {
		if (n < 1) {
			System.out.println(m);
			return;
		}
		sumOfNNumber(n - 1, m + n);
	}

}