package two_pointer_dsa_ques;

public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";

		//s = "race a car";

		//s = " ";

		//System.out.println(isPalindrome(s));

		System.out.println(isPalindromeOptimal(s));

	}

	public static boolean isPalindrome(String s) {
		String ss = s.replaceAll("\\s", "").replaceAll("[^a-zA-Z0-9]", "");
		ss = ss.toLowerCase();
		int n = ss.length() - 1;
		int i = 0;
		int j = n;
		if (s.length() == 1) {
			return true;
		}
		while (0 < n && !(i > n)) {
			if (ss.charAt(i) == ss.charAt(j)) {
				i++;
				j--;
			} else {
				return false;
			}
		}
		return true;

	}

	public static boolean isPalindromeOptimal(String s) {

		StringBuilder res = new StringBuilder();

		for (char c : s.toCharArray()) {
			if (Character.isLetterOrDigit(c)) {
				res.append(c);
			}
		}

		String str = res.toString().toLowerCase();
		int n = str.length();
		int i = 0;
		int j = n - 1;

		while (i <= j) {
			if (str.charAt(i) == str.charAt(j)) {
				i++;
				j--;
			} else {
				return false;
			}
		}
		return true;
	}
}
