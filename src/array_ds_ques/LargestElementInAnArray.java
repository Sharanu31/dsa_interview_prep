package array_ds_ques;

import java.util.Arrays;

public class LargestElementInAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 5, 7, 10 };
		brutrLargestElement(arr);
		optLargestElement(arr);
	}

	private static void optLargestElement(int[] arr) {
		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println(largest);

	}

	private static void brutrLargestElement(int[] arr) {
		Arrays.sort(arr);
		int largest = arr[arr.length - 1];
		System.out.println(largest);
	}

}
