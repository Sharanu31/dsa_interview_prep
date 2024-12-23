package array_ds_ques;

public class FinalArrayStateAfterKMultiplicationOperationsI {

	public static void main(String[] args) {
		int[] nums = { 2, 1, 3, 5, 6 };
		int k = 5, multiplier = 2;

		getFinalState(nums, k, multiplier);
	}

	public static int[] getFinalState(int[] nums, int k, int multiplier) {
		int[] minVal;
		for (int j = 0; j < k; j++) {
			minVal = getMin(nums);
			nums[minVal[1]] = minVal[0] * multiplier;
		}

		return nums;
	}

	public static int[] getMin(int[] nums) {

		int min = Integer.MAX_VALUE;
		int pos = 0;
		for (int i = 0; i < nums.length; i++) {
			if (min > nums[i]) {
				min = nums[i];
				pos = i;
			}
		}
		return new int[] { min, pos };

	}
}
