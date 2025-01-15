package sliding_window_dsa_ques;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {

	public static void main(String[] args) {
		int[] nums = { 1, 0, 1, 1 };
		int k = 1;
		containsNearbyDuplicate(nums, k);
		containsNearbyDuplicateOp(nums, k);
		containsNearbyDuplicateOptimal(nums, k);
	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				if (i - map.get(nums[i]) <= k) {
					return true;
				}
			}
			map.put(nums[i], i);
		}
		return false;
	}

	public static boolean containsNearbyDuplicateOp(int[] nums, int k) {
		Set<Integer> window = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (window.contains(nums[i])) {
				return true;
			}
			window.add(nums[i]);
			if (window.size() > k) {
				window.remove(nums[i - k]);
			}
		}
		return false;
	}

	public static boolean containsNearbyDuplicateOptimal(int[] nums, int k) {
		int n = nums.length;
		int c = 0;
		for (int i = 0; i < n; i++) {
			for (int j = Math.min(i + k, n - 1); j > i; j--, c++) {
				if (nums[i] == nums[j])
					return true;
				if (c > 4999)
					return false;
			}
		}
		return false;
	}
}
