package sliding_window_dsa_ques;

public class LongestRepeatingCharacterReplacement {
	public static void main(String[] args) {
		/*
		 * String s = "ABAB"; int k = 2
		 */;
		// Output 4
		String s = "AABABBA";
		int k = 1;
		// Output 4
		characterReplacement(s, k);
	}

	public static int characterReplacement(String s, int k) {

		int[] arr = new int[26];
		System.out.println();
		int ans = 0;
		int max = 0;
		int i = 0;
		for (int j = 0; j < s.length(); j++) {
			System.out.println(s.charAt(j) - 'A');

			arr[s.charAt(j) - 'A']++;
			max = Math.max(max, arr[s.charAt(j) - 'A']);
			if (j - i + 1 - max > k) {
				arr[s.charAt(i) - 'A']--;
				i++;
			}
			ans = Math.max(ans, j - i + 1);
		}
		return ans;
	}
}
