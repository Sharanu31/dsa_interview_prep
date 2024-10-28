package two_pointer_dsa_ques;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// int[] height = { 4, 3, 2, 1, 4 };
		// ex = 16
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		// 49
		maxArea(height);
		maxAreaOp(height);
	}

	public static int maxArea(int[] height) {
		int max = 0;
		int i = 0;
		int j = height.length - 1;
		while (i < j) {
			// Calculate the area using the shorter of the two heights (height[i] and
			// height[j])
			int area = Math.min(height[i], height[j]) * (j - i);
			max = Math.max(max, area);
			// Move the pointer for the shorter height inward
			if (height[i] < height[j]) {
				i++;
			} else {
				j--;
			}
		}
		return max;
	}

	public static int maxAreaOp(int[] height) {
		int i = 0, j = height.length - 1;
		int max = 0;
		while (i < j) {
			int min = Math.min(height[i], height[j]);
			max = Math.max(max, (j - i) * min);
			while (i < j && height[i] <= min)
				i++;
			while (i < j && height[j] <= min)
				j--;
		}
		return max;
	}

}
