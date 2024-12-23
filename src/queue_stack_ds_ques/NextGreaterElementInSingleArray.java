package queue_stack_ds_ques;

import java.util.Stack;

public class NextGreaterElementInSingleArray {

	public static void main(String[] args) {

		int[] nums = { 1, 3, 4, 2 };
		nextGreaterElement(nums);

	}

	public static int[] nextGreaterElement(int[] nums) {

		int[] val = new int[nums.length];
		Stack<Integer> stk = new Stack<Integer>();
		for (int i = nums.length - 1; i >= 0; i--) {
			while (!stk.empty() && stk.peek() < nums[i]) {
				stk.pop();
			}
			if (stk.isEmpty()) {
				val[i] = -1;
			} else {
				val[i] = stk.peek();
			}
			stk.push(nums[i]);
		}

		return val;

	}
}
