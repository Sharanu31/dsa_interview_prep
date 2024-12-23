package array_ds_ques;

public class CheckIfNAndItsDoubleExist {

	public static void main(String[] args) {

		int[] arr = { 3, 1, 7, 11 };
		checkIfExist(arr);
	}

	public static boolean checkIfExist(int[] arr) {
		int left = 0;
		int leftVal;
		int rightVal;

		while (left < arr.length) {
			leftVal = arr[left];
			for (int right = 0; right < arr.length; right++) {
				rightVal = arr[right] * 2;
				if (leftVal == rightVal && left != right) {
					return true;
				}

			}
			left++;
		}
		return false;
	}
}
