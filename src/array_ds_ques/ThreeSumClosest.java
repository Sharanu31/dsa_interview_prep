package array_ds_ques;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		int[] nums = { -1, 2, 1, -4 };
		int target = 1;
		threeSumClosest(nums, target);
	}

	public static int threeSumClosest(int[] nums, int target) {

		Arrays.sort(nums);
		int resultSum = nums[0] + nums[1] + nums[2];
		int minDifference = Integer.MAX_VALUE;

		for (int i = 0; i < nums.length; i++) {
			int left = i + 1;
			int right = nums.length - 1;

			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];

				if (sum == target) {
					return sum;
				} else if (sum > target) {
					right--;
				} else {
					left++;
				}

				int diff = Math.abs(target - sum);
				if (diff < minDifference) {
					resultSum = sum;
					minDifference = diff;
				}
			}
		}

		return resultSum;

	}
}
