package array_ds_ques;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 4, 3, 4, 3 };
		singleNumber(nums);
		singleNumberOpt(nums);
		singleNumberOptPro(nums);
	}

	private static int singleNumberOptPro(int[] nums) {
		int xor = 0;
		for (int i = 0; i < nums.length; i++) {
			xor = xor ^ nums[i];
		}
		return xor;

	}

	public static int singleNumber(int[] nums) {
		HashMap<Integer, Integer> output = new HashMap<Integer, Integer>();
		for (Integer num : nums) {
			if (output.containsKey(num)) {
				output.put(num, output.get(num) + 1);
			}
			output.put(num, output.getOrDefault(num, 0) + 1);

		}
		for (Map.Entry<Integer, Integer> entry : output.entrySet()) {
			if (entry.getValue() <= 1) {
				return entry.getKey();
			}
		}
		return 0;
	}

	public static int singleNumberOpt(int[] nums) {
		return single(0, nums);
	}

	public static int single(int i, int[] nums) {
		if (i == nums.length) {
			return 0;
		}
		return nums[i] ^ single(i + 1, nums);
	}
}
