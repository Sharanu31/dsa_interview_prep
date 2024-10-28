package two_pointer_dsa_ques;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		String s = "the sky is blue";
		s = "a good   example";
		reverseWords(s);
	}

	public static String reverseWords(String s) {
		String[] split = s.trim().split(" ");
		int i = 0;
		int j = split.length - 1;
		StringBuilder str = new StringBuilder();
		while (i <= j) {
			if (split[j].trim().equals("")) {
				j--;
				continue;
			}
			str = str.append(" ").append(split[j].trim());
			j--;
		}
		return str.toString().trim();
	}
}
