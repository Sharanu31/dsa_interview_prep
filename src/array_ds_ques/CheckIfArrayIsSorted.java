package array_ds_ques;

public class CheckIfArrayIsSorted {

	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 3, 4, 5 };
		System.out.println(isSorted(a));
		int[] b = { 1, 9, 2, 3, 4, 5 };
		System.out.println(isSorted(b));

	}

	private static boolean isSorted(int[] a) {

		for (int i = 1; i < a.length; i++) {
			if (a[i] >= a[i - 1]) {

			} else {
				return false;
			}
		}
		return true;

	}

}
