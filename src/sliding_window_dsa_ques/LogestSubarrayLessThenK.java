package sliding_window_dsa_ques;

import java.util.ArrayList;
import java.util.List;

public class LogestSubarrayLessThenK {

	public static void main(String[] args) {
		int arr[] = { 2, 5, 1, 7, 10 };
		int k = 14;
		System.out.println(longestAubArray(arr, k));
		findAllSubArrayLessThenK(arr, k);

	}

	private static void findAllSubArrayLessThenK(int[] arr, int k) {

		int left = 0, right = 0, sum = 0, max = 0;
		List<List<Integer>> liA = new ArrayList<>();
		while (right < arr.length) {
			sum = sum + arr[right];
			while (sum > k) {
				sum = sum - arr[left];
				left++;
			}
			if (sum <= k) {
				max = Math.max(max, right - left + 1);
				liA.add(new ArrayList());
			}
			right++;
		}

	}

	private static int longestAubArray(int[] arr, int k) {
		int left = 0, right = 0, sum = 0, max = 0;
		while (right < arr.length) {
			sum = sum + arr[right];
			while (sum > k) {
				sum = sum - arr[left];
				left++;
			}
			if (sum <= k) {
				max = Math.max(max, right - left + 1);
			}
			right++;
		}
		return max;
	}

}
