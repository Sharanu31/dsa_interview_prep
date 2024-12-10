package array_ds_ques;

import java.util.Arrays;

public class SecondLargestElementInAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 5, 7, 10, 10 };
		// bruteSolutionSecondLargest(arr);
		// betterSolutionSecondLargest(arr);
		optialSolutionSecondLargest(arr);
	}

	private static void optialSolutionSecondLargest(int[] arr) {
		int largest = arr[0];
		int secondLargest = -1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] < largest && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println(secondLargest);

	}

	private static void betterSolutionSecondLargest(int[] arr) {

		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		int secondLargest = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		System.out.println(secondLargest);

	}

	private static void bruteSolutionSecondLargest(int[] arr) {
		Arrays.sort(arr);
		int secondLargest = 0;
		int largest = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] != largest) {
				secondLargest = arr[i];
				break;
			}
		}
		System.out.println(secondLargest);
	}

}
