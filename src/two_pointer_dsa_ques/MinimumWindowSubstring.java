package two_pointer_dsa_ques;

import java.util.HashMap;

public class MinimumWindowSubstring {

	public static void main(String[] args) {
		String s = "ddaaabbca";
		String t = "abc";
		minimumSubString(s, t);
	}

	public static String minimumSubString(String s, String t) {
		HashMap<Character, Integer> mapV = new HashMap<>();
		int l = 0, r = 0, minLen = Integer.MAX_VALUE, startIn = -1, count = 0;
		int n = s.length(), m = t.length();
		// Create frequency map for t
		for (int i = 0; i < m; i++) {
			mapV.put(t.charAt(i), mapV.getOrDefault(t.charAt(i), 0) + 1);
		}
		while (r < n) {
			char rightChar = s.charAt(r);
			// Decrease the count for current character if it's in t
			if (mapV.containsKey(rightChar)) {
				mapV.put(rightChar, mapV.get(rightChar) - 1);
				if (mapV.get(rightChar) >= 0) { // Valid count
					count++;
				}
			}
			// When we have all characters from t in the window
			while (count == m) {
				if (r - l + 1 < minLen) {
					minLen = r - l + 1;
					startIn = l;
				}
				char leftChar = s.charAt(l);
				if (mapV.containsKey(leftChar)) {
					mapV.put(leftChar, mapV.get(leftChar) + 1);
					if (mapV.get(leftChar) > 0) { // It's no longer a valid window
						count--;
					}
				}
				l++; // Shrink the window
			}
			r++; // Expand the window
		}
		return (startIn == -1) ? "" : s.substring(startIn, startIn + minLen);
	}

}
