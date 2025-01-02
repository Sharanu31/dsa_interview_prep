package two_pointer_dsa_ques;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2 };
		removeDuplicates(nums);
		removeDuplicatesOth(nums);
	}

	public static int removeDuplicates(int[] nums) {
		int j = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[j] = nums[i];
				j++;
			}
		}
		return j;
	}

	public static int removeDuplicatesOth(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
				continue;
			} else {
				nums[count] = nums[i];
				count++;
			}
		}

		return count;
	}
}
