package array_ds_ques;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int nums[] = { -3, -1, 0, 0, 0, 3, 3 };
		bruteRemoveDuplicates(nums);
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
