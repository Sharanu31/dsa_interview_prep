package string_dsa_ques;

public class MaximumScoreAfterSplittingAString {

	public static void main(String[] args) {
		String s = "00";
		maxScore(s);
		maxScoreOpt(s);
	}

	private static int maxScoreOpt(String s) {
		int n = s.length();
		int ons = 0;
		int curr = s.charAt(0) == '0' ? 1 : 0;
		int score = curr;

		for (int i = 1; i < n - 1; i++) {
			if (s.charAt(i) == '0') {
				curr++;
			} else {
				ons++;
				curr--;
			}
			if (curr > score) {
				score = curr;
			}
		}
		ons += s.charAt(n - 1) == '1' ? 1 : 0;

		return ons + score;
	}

	public static int maxScore(String s) {
		int leftZeros = 0, rightOnes = 0;
		int max = 0;
		for (int i = 0; i < s.length(); i++) {
			leftZeros = countZeros(s.substring(0, i + 1));
			if (s.substring(i + 1, s.length()).isEmpty()) {
				break;
			} else {
				rightOnes = countOnes(s.substring(i + 1, s.length()));
			}
			int sum = leftZeros + rightOnes;
			max = Math.max(max, sum);
		}
		return max;
	}

	public static int countZeros(String zeros) {
		int zero = 0;
		for (int i = 0; i < zeros.length(); i++) {
			if (zeros.charAt(i) == '0') {
				zero++;
			}
		}
		return zero;
	}

	public static int countOnes(String ones) {
		int one = 0;
		for (int i = 0; i < ones.length(); i++) {
			if (ones.charAt(i) == '1') {
				one++;
			}
		}
		return one;
	}
}
