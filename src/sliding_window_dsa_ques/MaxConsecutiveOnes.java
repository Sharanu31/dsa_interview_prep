package sliding_window_dsa_ques;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {

		// int[] nums = { 1, 1, 0, 1, 1, 1 };

		int[] nums = { 1, 0, 1, 1, 0, 1 };
		findMaxConsecutiveOnes(nums);

	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int left = 0, right = 0, max = 0;
		while (right < nums.length) {
			if (nums[right] == 0) {
				left = right + 1;
			} else {
				max = Math.max(max, right - left + 1);
			}
			right++;
		}
		return max;

	}
}
