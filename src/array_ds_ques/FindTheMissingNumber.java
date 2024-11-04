package array_ds_ques;

public class FindTheMissingNumber {

	public static int missingNumber(int n, int[] arr) {
		// Create hash array of size n+1
		int[] hash = new int[n + 1];

		// Store frequencies of elements
		for (int i = 0; i < n - 1; i++) {
			hash[arr[i]]++;
		}

		// Find the missing number
		for (int i = 1; i <= n; i++) {
			if (hash[i] == 0) {
				return i;
			}
		}

		// Edge case handling (though problem guarantees a
		// solution)
		return -1;
	}

	/*
	 * Step-by-Step Execution Initialization arr is initialized with {1, 2, 3, 5}. n
	 * is set to arr.length + 1, which is 5 (since arr has 4 elements). hash is
	 * initialized as an integer array of size n + 1, which is 6, so hash = {0, 0,
	 * 0, 0, 0, 0}.
	 * 
	 * First Iteration (i = 0) 
	 * arr[0] is 1. 
	 * hash[arr[0]] translates to hash[1].
	 * hash[1]++ increments the value at index 1 of hash by 1. 
	 * hash now becomes {0, 1, 0, 0, 0, 0}.
	 * 
	 * Second Iteration (i = 1) 
	 * arr[1] is 2. 
	 * hash[arr[1]] translates to hash[2].
	 * hash[2]++ increments the value at index 2 of hash by 1. 
	 * hash now becomes {0,1, 1, 0, 0, 0}.
	 * 
	 * Third Iteration (i = 2) 
	 * arr[2] is 3. 
	 * hash[arr[2]] translates to hash[3].
	 * hash[3]++ increments the value at index 3 of hash by 1. 
	 * hash now becomes {0,1, 1, 1, 0, 0}.
	 * 
	 * Fourth Iteration (i = 3) 
	 * arr[3] is 5. 
	 * hash[arr[3]] translates to hash[5].
	 * hash[5]++ increments the value at index 5 of hash by 1. 
	 * hash now becomes {0, 1, 1, 1, 0, 1}.
	 */

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5 };
		int n = 5;
		System.out.println(missingNumber(n, arr));
	}
}
