package recursion_ds_ques;

public class PrintLinearlyOneToN {

	public static void main(String[] args) {
		int i = 0;
		int n = 5;
		funPrint(i++, n);

	}

	private static void funPrint(int i, int n) {
		if (i > n)
			return;
		System.out.println(i);
		funPrint(i + 1, n);
	}

}
