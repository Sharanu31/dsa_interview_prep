package two_pointer_dsa_ques;

public class ReverseVowelsOfAString {

	public static void main(String[] args) {
		String s = "IceCreAm";
		reverseVowels(s);
	}

	public static String reverseVowels(String s) {
		char[] str = s.toCharArray();
		int i = 0;
		int j = str.length - 1;
		boolean right = false, left = false;
		while (i <= j) {
			if (vowelsValue(str[j])) {
				right = true;
			} else {
				right = false;
				j--;
			}
			if (vowelsValue(str[i])) {
				left = true;
			} else {
				right = false;
				i++;
			}
			if (right && left) {
				char temp = str[j];
				str[j] = str[i];
				str[i] = temp;
				i++;
				j--;
			}
		}
		return new String(str);
	}

	static boolean vowelsValue(char strVal) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		for (char vowel : vowels) {
			if (Character.toString(strVal).equalsIgnoreCase(Character.toString(vowel))) {
				return true;
			}
		}
		return false;

	}
}
