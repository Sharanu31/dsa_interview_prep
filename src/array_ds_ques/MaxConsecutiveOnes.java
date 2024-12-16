package array_ds_ques;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int[] nums = { 1, 0, 1, 1, 0, 1 };
		findMaxConsecutiveOnes(nums);
		optfindMaxConsecutiveOnes(nums);
	}

	private static int optfindMaxConsecutiveOnes(int[] nums) {
		int count = 0;
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				count++;
				max = Math.max(max, count);
			} else {
				count = 0;
			}
		}
		return max;

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
