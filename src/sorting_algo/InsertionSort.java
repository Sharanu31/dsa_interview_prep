package sorting_algo;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 4, 22, 33, 87, 1, 66, 74, 20 };
		insertionSort(arr);
	}

	static void insertionSort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		for (int o : arr) {
			System.out.println(o);
		}
	}

}
