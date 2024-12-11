package array_ds_ques;

public class RotateArrayLeftByOnePlace {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		int k = 1;
		rotate(nums, k);

	}

	public static int[] rotate(int[] nums, int k) {
		int temp = nums[0];
		for (int i = 1; i <= nums.length - 1; i++) {
			nums[i - 1] = nums[i];
		}
		nums[nums.length - 1] = temp;
		return nums;
	}
}