package queue_stack_ds_ques;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 1 };
		nextGreaterElements(nums);
		optnextGreaterElements(nums);
	}

	public static int[] nextGreaterElements(int[] nums) {
		int[] val = new int[nums.length]; 
		Stack<Integer> stk = new Stack<Integer>();
		int n = nums.length;
		for (int i = 2 * n - 1; i >= 0; i--) {
			while (!stk.empty() && stk.peek() <= nums[i % n]) {
				stk.pop();
			}
			if (i < n) {
				val[i] = stk.isEmpty() ? -1 : stk.peek();
			}
			stk.push(nums[i % n]);
		}
		return val;
	}

	public static int[] optnextGreaterElements(int[] nums) {
		int[] ans = new int[nums.length];
		Arrays.fill(ans, -1);
		int[] stack = new int[nums.length];
		int top = -1;
		for (int i = 0; i < nums.length; i++) {
			while (top >= 0 && nums[i] > nums[stack[top]]) {
				ans[stack[top--]] = nums[i];
			}
			stack[++top] = i;
		}
		for (int i = 0; i < nums.length; i++) {
			while (top >= 0 && nums[i] > nums[stack[top]]) {
				ans[stack[top--]] = nums[i];
			}
		}
		return ans;
	}
}
