package sliding_window_dsa_ques;

public class MaxConsecutiveOnesIII {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
		int k = 2;
		longestOnes(nums, k);

	}

	public static int longestOnes(int[] nums, int k) {
		int left = 0, right = 0, max = 0, zero = 0;
		while (right < nums.length) {
			if (nums[right] == 0) {
				zero++;
			}
			if (zero > k) {
				if (nums[left] == 0) {
					zero--;
				}
				left++;
			}
			if (zero <= k) {
				max = Math.max(max, right - left + 1);
			}
			right++;
		}
		return max;
	}

}
