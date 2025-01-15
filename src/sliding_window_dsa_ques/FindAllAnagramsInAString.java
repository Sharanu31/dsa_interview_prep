package sliding_window_dsa_ques;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInAString {

	public static void main(String[] args) {

		String s = "cbaebabacd";
		String p = "abc";
		findAnagrams(s, p);
	}

	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> result = new ArrayList<>();
		if (s.length() < p.length())
			return result;

		int[] pCount = new int[26];
		int[] sCount = new int[26];

		for (char c : p.toCharArray()) {
			pCount[c - 'a']++;
		}

		int windowSize = p.length(); 

		for (int i = 0; i < s.length(); i++) {
			// Add the current character to the window
			sCount[s.charAt(i) - 'a']++;

			if (i >= windowSize) {
				sCount[s.charAt(i - windowSize) - 'a']--;
			}

			if (areEqual(pCount, sCount)) {
				result.add(i - windowSize + 1);
			}
		}

		return result;
	}

	private static boolean areEqual(int[] arr1, int[] arr2) {
		for (int i = 0; i < 26; i++) {
			if (arr1[i] != arr2[i])
				return false;
		}
		return true;
	}
}
