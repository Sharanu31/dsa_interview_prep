package array_ds_ques;

public class MoveZeroes {

	public static void main(String[] args) {
		int[] nums = { 1, 0, 1, 0, 3, 12 };
		// brutemoveZeroes(nums);
		moveZeroes(nums);
	}

	private static int[] brutemoveZeroes(int[] nums) {
		int nonZero = 0;
		for (int i = 0; i <= nums.length - 1; i++) {
			if (nums[i] != 0) {
				nums[nonZero] = nums[i];
				nonZero++;
			}
		}
		for (int i = nonZero; i <= nums.length - 1; i++) {
			nums[i] = 0;
		}
		return nums;

	}

	public static void moveZeroes(int[] nums) {
		int j = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				j = i;
				break;
			}
		}
		if (j == -1) {
			return;
		}
		for (int i = j + 1; i < nums.length; i++) {
			if (nums[i] != 0) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				j++;
			}
		}
	}

}
