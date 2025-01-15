package string_dsa_ques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {

	public static void main(String[] args) {
		String s = "cbaebabacd", p = "abc";
		findAnagrams(s, p);
	}

	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> result = new ArrayList<>();
		if (s.length() < p.length())
			return result;

		// Frequency map for the target string2
		int[] targetFreq = new int[26];
		for (char c : p.toCharArray()) {
			targetFreq[c - 'a']++;
		}

		// Frequency map for the current window
		int[] windowFreq = new int[26];
		int start = 0;
		int targetLength = p.length();

		for (int end = 0; end < s.length(); end++) {
			// Add the current character to the window
			windowFreq[s.charAt(end) - 'a']++;

			// Ensure the window size matches the target length
			if (end - start + 1 == targetLength) {
				// Check if the current window matches the target frequency
				if (Arrays.equals(windowFreq, targetFreq)) {
					result.add(start);
				}

				// Shrink the window by removing the start character
				windowFreq[s.charAt(start) - 'a']--;
				start++;
			}
		}

		return result;
	}

}
