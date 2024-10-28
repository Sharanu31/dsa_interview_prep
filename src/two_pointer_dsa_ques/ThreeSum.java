package two_pointer_dsa_ques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {

		int[] nums = { -1, 0, 1, 2, -1, -4 };

		threeSum(nums);
		threeSumOptimal(nums);
		threeSumNeetCode(nums);
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);

		Set<List<Integer>> s = new HashSet<>();
		// List<List<Integer>> output = new ArrayList<>();
		int target = 0;
		for (int i = 0; i < nums.length - 2; i++) {
			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if (sum == target) {
					s.add(Arrays.asList(nums[i], nums[j], nums[k]));
					j++;
					k--;
				} else if (sum < target) {
					j++;
				} else {
					k--;
				}
			}

		}
		/* output.addAll(s); */
		return new ArrayList<>(s);

	}

	public static List<List<Integer>> threeSumOptimal(int[] nums) {
		int target = 0;
		Arrays.sort(nums);
		Set<List<Integer>> s = new HashSet<>();
		List<List<Integer>> output = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if (sum == target) {
					s.add(Arrays.asList(nums[i], nums[j], nums[k]));
					j++;
					k--;
				} else if (sum < target) {
					j++;
				} else {
					k--;
				}
			}
		}
		output.addAll(s);
		return output;
	}

	public static List<List<Integer>> threeSumNeetCode(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0)
				break;
			if (i > 0 && nums[i] == nums[i - 1])
				continue;

			int l = i + 1, r = nums.length - 1;
			while (l < r) {
				int sum = nums[i] + nums[l] + nums[r];
				if (sum > 0) {
					r--;
				} else if (sum < 0) {
					l++;
				} else {
					res.add(Arrays.asList(nums[i], nums[l], nums[r]));
					l++;
					r--;
					while (l < r && nums[l] == nums[l - 1]) {
						l++;
					}
				}
			}
		}
		return res;

	}

}
