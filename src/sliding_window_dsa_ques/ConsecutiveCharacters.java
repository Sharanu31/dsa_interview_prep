package sliding_window_dsa_ques;

public class ConsecutiveCharacters {
	public static void main(String[] args) {
		String s = "abbcccddddeeeeedcba";
		maxPower(s);
	}

	public static int maxPower(String s) {
		int right = 0;
		int left = 0;
		int max = 0;
		while (right < s.length()) {
			if (s.charAt(left) == s.charAt(right)) {
				max = Math.max(max, right - left + 1);
			} else {
				left = right;
			}
			right++;
		}
		return max;
	}
}
