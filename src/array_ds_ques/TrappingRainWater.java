package array_ds_ques;

public class TrappingRainWater {

	public static void main(String[] args) {
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		trap(height);
		trapTUFSol(height);
	}

	public static int trap(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int leftMax = height[left];
		int rightMax = height[right];
		int water = 0;
		while (left < right) {
			if (height[left] > height[right]) {
				if (rightMax > height[right]) {
					water += rightMax - height[right];
				} else {
					rightMax = height[right];
				}
				right -= 1;
			} else {
				if (leftMax > height[left]) {
					water += leftMax - height[left];
				} else {
					leftMax = height[left];
				}
				left += 1;
			}
		}
		return water;
	}

	public static int trapTUFSol(int[] height) {
		int lMax = 0, rmax = 0, tWater = 0;
		int l = 0;
		int r = height.length - 1;
		while (l < r) {
			if (height[l] >= height[r]) {
				if (rmax > height[r]) {
					tWater += rmax - height[r];
				} else {
					rmax = height[r];
				}
				r--;

			} else {

				if (lMax > height[l]) {
					tWater += lMax - height[l];
				} else {
					lMax = height[l];
				}
				l++;
			}
		}
		return tWater;

	}

}
