package string_dsa_ques;

public class CheckingStringIsPalindromOrNotUsingRecursoin {

	public static void main(String[] args) {
		String s = "ABBA";
		System.out.println(isPalindrom(s, 0));
		s = "CDSA";
		System.out.println(isPalindrom(s, 0));
	}

	private static boolean isPalindrom(String s, int i) {
		// Here if i exceeds the length greater then half of its value it means
		// everything is matching
		if (i >= s.length() / 2) {
			return true;
		}
		if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
			return false;
		}
		return isPalindrom(s, i + 1);
	}
}