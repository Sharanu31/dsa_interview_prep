package array_ds_ques;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		twoSum(nums, target);
	}

	public static int[] twoSum(int[] nums, int target) {
		int l = 0;
		int r = nums.length - 1;
		int sum = 0;
		int[] newInt = new int[2];
		while (r >= 0) {
			sum = nums[l] + nums[r];
			if (sum > target) {
				r--;
			} else if (sum < target) {
				l++;
			} else {
				newInt[0] = l;
				newInt[1] = r;
				break;
			}
		}
		return newInt;
	}
}
