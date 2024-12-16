package recursion_ds_ques;

public class PrintLinearlyOneToNWithBackTracking {

	public static void main(String[] args) {
		int n = 6;
		funPrintAsc(n, n);
		int m = 1;
		funcPringDsc(m, m);

	}

	private static void funcPringDsc(int i, int m) {

		if (i > 6)
			return;
		funcPringDsc(i + 1, m);
		System.out.println(i);

	}

	private static void funPrintAsc(int i, int n) {
		if (i < 1)
			return;
		funPrintAsc(i - 1, n);
		System.out.println(i);
	}

}
