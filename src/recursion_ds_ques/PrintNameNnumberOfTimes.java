package recursion_ds_ques;

public class PrintNameNnumberOfTimes {

	static int val = 0;

	public static void main(String[] args) {

		String name = "Sharanu";
		int count = 6;
		printNameNTimes(name, count, val);
	}

	private static void printNameNTimes(String name, int count, int val) {
		if (val == count)
			return;
		val++;
		System.out.println(name);
		printNameNTimes(name, count, val);

	}

}
