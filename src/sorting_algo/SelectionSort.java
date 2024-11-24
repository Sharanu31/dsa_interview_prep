package sorting_algo;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 4, 22, 33, 87, 1, 66, 74, 20 };
		selectionSort(arr);
	}

	static void selectionSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			// Swap the found minimum element with the first element
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		for (int o : arr) {
			System.out.println(o);
		}
	}

}
