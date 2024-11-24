package sorting_algo;

public class QuickSort {

	public static void main(String[] args) {
		int arr[] = { 4, 22, 33, 87, 1, 66, 74, 20 };
		int left = 0;
		int right = arr.length - 1;
		quickSort(arr, left, right);
		for (int o : arr) {
			System.out.println(o);
		}
	}

	static void quickSort(int arr[], int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return i + 1;
	}

}
