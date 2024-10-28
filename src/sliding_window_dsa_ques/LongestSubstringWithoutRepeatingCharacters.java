package sliding_window_dsa_ques;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {

		String s = "pwwkew";
		lengthOfLongestSubstring(s);
		lengthOfLongestSubstringChat(s);
		lengthOfLongestSubstringOne(s);
	}

	public static int lengthOfLongestSubstring(String s) {
		int start = 0;
		int end = 0;
		int maxl = 0;
		List<Character> ss = new ArrayList<Character>();
		while (end < s.length()) {
			if (!ss.contains(s.charAt(end))) {
				ss.add(s.charAt(end));
				end++;
				maxl = Math.max(maxl, ss.size());
			} else {
				ss.remove(Character.valueOf(s.charAt(start)));
				start++;
			}
		}

		return maxl;
	}

	public static int lengthOfLongestSubstringChat(String s) {
		int n = s.length();
		int maxLen = 0;
		int left = 0;
		HashSet<Character> window = new HashSet<>();
		for (int right = 0; right < n; right++) {
			char currentChar = s.charAt(right);
			while (window.contains(currentChar)) {
				window.remove(s.charAt(left));
				left++;
			}
			window.add(currentChar);
			maxLen = Math.max(maxLen, right - left + 1);
		}
		return maxLen;
	}

	public static int lengthOfLongestSubstringOne(String s) {
		if (s == null || s.length() == 0)
			return 0;
		int max = 1, left = 0, right = 0;
		Map<Character, Integer> lastCharIndexMap = new HashMap<Character, Integer>();

		while (right < s.length()) {
			char curr = s.charAt(right);
			if (lastCharIndexMap.containsKey(curr)) {
				int lastIndex = lastCharIndexMap.get(curr);
				left = Math.max(left, lastIndex + 1);
			}
			max = Math.max(max, right - left + 1);
			lastCharIndexMap.put(curr, right);
			right++;
		}
		return max;
	}

}
