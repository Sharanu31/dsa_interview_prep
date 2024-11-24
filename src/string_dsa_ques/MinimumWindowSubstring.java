package string_dsa_ques;

public class MinimumWindowSubstring {

	public static void main(String[] args) {
		String s = "ADOBECODEBANC";
		String t = "ABC";
		minWindow(s, t);
		minWindowOp(s, t);
	}

	public static String minWindow(String s, String t) {
		int[] map = new int[128];
		for (char c : t.toCharArray()) {
			map[c]++;
		}
		int start = 0, r = 0, minStart = 0, minLen = Integer.MAX_VALUE, counter = t.length();
		while (r < s.length()) {
			final char c1 = s.charAt(r);
			if (map[c1] > 0)
				counter--;
			map[c1]--;
			r++;
			while (counter == 0) {
				if (minLen > r - start) {
					minLen = r - start;
					minStart = start;
				}
				final char c2 = s.charAt(start);
				map[c2]++;
				if (map[c2] > 0)
					counter++;
				start++;
			}
		}
		return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
	}

	public static String minWindowOp(String s, String t) {// Initialize the frequency map
		int[] map = new int[128];
		for (char c : t.toCharArray()) {
			map[c]++;
		}
		int counter = t.length(); // Number of characters to match
		int l = 0, r = 0; // Pointers for the sliding window
		int minLen = Integer.MAX_VALUE; // Length of the minimum window
		int head = 0; // Starting index of the minimum window
		while (r < s.length()) {
			// Expand the window by including the character at `r`
			if (map[s.charAt(r)] > 0) {
				counter--; // Decrease counter only if the character is in `t`
			}
			map[s.charAt(r)]--; // Decrease frequency in map
			r++; // Move the `r` pointer
			// When a valid window is found
			while (counter == 0) {
				// Update the minimum window
				if (r - l < minLen) {
					minLen = r - l;
					head = l;
				}
				// Shrink the window from the `l` side
				if (map[s.charAt(l)] == 0) {
					counter++; // Increment counter as the window becomes invalid
				}
				map[s.charAt(l)]++; // Restore the frequency
				l++; // Move the `l` pointer
			}
		}
		// Return the result
		return minLen == Integer.MAX_VALUE ? "" : s.substring(head, head + minLen);
	}
}
