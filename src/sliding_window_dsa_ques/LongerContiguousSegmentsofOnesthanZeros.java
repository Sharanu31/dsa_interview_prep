package sliding_window_dsa_ques;

public class LongerContiguousSegmentsofOnesthanZeros {

	public static void main(String[] args) {
		String s = "1101";
		checkZeroOnes(s);
	}

	public static boolean checkZeroOnes(String s) {
		int ones = 0, zeros = 0;
		int maxOnes = 0;
		int maxZeros = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				ones++;
				zeros = 0;
				maxOnes = Math.max(maxOnes, ones);

			} else {
				zeros++;
				ones = 0;
				maxZeros = Math.max(maxZeros, zeros);

			}
		}
		return maxOnes > maxZeros;
	}

}
