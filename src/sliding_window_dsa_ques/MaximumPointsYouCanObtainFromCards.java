package sliding_window_dsa_ques;

public class MaximumPointsYouCanObtainFromCards {

	public static void main(String[] args) {

		// int[] cardPoints = { 1, 2, 3, 4, 5, 6, 1 };int k = 3;
		int[] cardPoints = { 2, 2, 2 };
		int k = 2;

		maxScore(cardPoints, k);
	}

	public static int maxScore(int[] cardPoints, int k) {
		int leftSum = 0;
		int rightSum = 0;
		int maxSum = 0;
		for (int i = 0; i <= k - 1; i++) {
			leftSum = leftSum + cardPoints[i];
		}
		maxSum = leftSum;
		int rightIndex = cardPoints.length - 1;
		for (int i = k - 1; i >= 0; i--) {
			leftSum -= cardPoints[i];
			rightSum += cardPoints[rightIndex];
			rightIndex--;
			maxSum = Math.max(maxSum, leftSum + rightSum);
		}

		return maxSum;
	}
}
