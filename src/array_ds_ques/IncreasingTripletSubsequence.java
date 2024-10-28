package array_ds_ques;

public class IncreasingTripletSubsequence {

	public static void main(String[] args) {

		 int[] nums = { 1, 2, 3, 4, 5 };
		/*
		 *
		 * int[] nums = { 5, 4, 3, 2, 1 };
		 */
		//int[] nums = { 20, 100, 10, 12, 5, 13 };

		increasingTriplet(nums);
		increasingTripletChat(nums);
	}

	public static boolean increasingTriplet(int[] nums) {
		int i = 0;
		int j = 1;
		int k = j + 1;
		boolean val = false;
		while (k < nums.length) {
			if (nums[i] < nums[j] && nums[j] < nums[k]) {
				val = true;
			} else {
				val = false;
			}
			i++;
			j++;
			k++;
		}
		return val;
	}

	public static boolean increasingTripletChat(int[] nums) {
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		for (int num : nums) {
			if (num <= first) {
				first = num; 
			} else if (num <= second) {
				second = num; 
			} else {
				return true;
			}
		}
		return false; 
	}
}
