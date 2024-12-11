package array_ds_ques;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int nums[] = { -3, -1, 0, 0, 0, 3, 3 };
		// bruteRemoveDuplicates(nums);
		optimalRemoveDuplicates(nums);
	}

	private static int optimalRemoveDuplicates(int[] nums) {
		int left = 0;
		for (int right = 1; right < nums.length; right++) {
			if (nums[right] != nums[left]) {
				nums[left + 1] = nums[right];
				left++;
			}
		}
		return left + 1;

	}

	public static int bruteRemoveDuplicates(int[] nums) {
		Set<Integer> se = new TreeSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			se.add(nums[i]);
		}

		int index = 0;
		for (int s : se) {
			nums[index] = s;
			index++;
		}
		return index;

	}
}
