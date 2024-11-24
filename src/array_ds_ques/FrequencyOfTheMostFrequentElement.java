package array_ds_ques;

import java.util.Arrays;

public class FrequencyOfTheMostFrequentElement {

	public static void main(String[] args) {
		int[] nums = {3,9,6};
		int k = 2;
		maxFrequency(nums, k);
	}

	public static int maxFrequency(int[] nums, int k) {
		Arrays.sort(nums);
		long sum = 0;
		int left = 0;
		int ans = 1;
		for (int right = 0; right < nums.length; ++right) {
			sum += nums[right];
			while ((long) (right - left + 1) * nums[right] - sum > k) {
				sum -= nums[left];
				left++;
			}
			ans = Math.max(ans, right - left + 1);
		}
		return ans;
	}
}
