package queue_stack_ds_ques;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {

	public static void main(String[] args) {
		int[] nums1 = { 4, 1, 2 };
		int[] nums2 = { 1, 3, 4, 2 };
		nextGreaterElement(nums1, nums2);
		optnextGreaterElement(nums1, nums2);
	}

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] ans = new int[nums1.length];

		for (int i = 0; i < nums1.length; i++) {
			int greaterIdx = -1;
			int j = nums2.length - 1;
			while (j >= 0 && nums2[j] != nums1[i]) {
				if (nums2[j] > nums1[i]) {
					greaterIdx = nums2[j];
				}
				j--;
			}
			ans[i] = greaterIdx;
		}

		return ans;
	}

	public static int[] optnextGreaterElement(int[] nums1, int[] nums2) {
		int[] ans = new int[nums1.length];

		Stack<Integer> stack = new Stack<>();
		HashMap<Integer, Integer> map = new HashMap<>();

		// find out all the next greater elements in nums2 array
		for (int num : nums2) {
			// if num is greater than top elements in stack then it is the next greater
			// element in nums2
			while (!stack.isEmpty() && num > stack.peek()) {
				map.put(stack.pop(), num);
			}
			// then add num to stack
			stack.add(num);
		}

		int i = 0;
		for (int num : nums1) {
			ans[i++] = map.getOrDefault(num, -1);
		}

		return ans;
	}
}
