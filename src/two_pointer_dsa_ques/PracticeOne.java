package two_pointer_dsa_ques;

public class PracticeOne {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 35, 50 };
		int target = 70;

		System.out.println(twoPointerSum(arr, target));

		int arr1[] = { 10, 20, 30 };
		int target1 = 70;

		System.out.println(twoPointerSum(arr1, target1));

		int arr2[] = { -8, 1, 4, 6, 10, 45 };
		int target2 = 16;

		System.out.println(twoPointerSum(arr2, target2));

	}

	private static int[] twoPointerSum(int[] arr, int target) {
		int[] res = new int[2];
		/*
		 * for (int i = 0; i < arr.length; i++) { int j = arr.length - 1; while (i < j)
		 * { int sum = arr[i] + arr[j]; if (sum == target) { res[0] = arr[i]; res[1] =
		 * arr[j]; return res; } j--; } } return new int[] {};
		 */
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int sum = arr[left] + arr[right];
			if (sum == target) {
				res[0] = arr[left];
				res[1] = arr[right];
				return res;
			} else if (sum < target)
				left++;
			else
				right--;
		}
		return new int[] {};
	}

}
