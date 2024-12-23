package recursion_ds_ques;

public class ReverseAnArray {

	public static void main(String[] args) {
		int n = 5;
		int arr[] = { 5, 4, 3, 2, 1 };
		reverse(arr, 0, n - 1);
	}

	private static void reverse(int[] arr, int start, int end) {
		if (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[start] = temp;
			reverse(arr, start + 1, end - 1);
		}

	}

}