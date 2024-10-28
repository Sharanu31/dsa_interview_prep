package sliding_window_dsa_ques;

import java.util.HashMap;

public class ContainsDuplicateII {

	public static void main(String[] args) {
		int[] nums = { 1, 0, 1, 1 };
		int k = 1;
		containsNearbyDuplicate(nums, k);
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
}
