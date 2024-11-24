package sorting_algo;

public class BubbleSortExample {

	public static void main(String[] args) {

		int arr[] = { 4, 22, 33, 87, 1, 66, 74, 20 };
		int[] output = new int[arr.length];
		output = bubbleSort(arr);
		for (int o : output) {
			System.out.println(o);
		}
	}

	static int[] bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// Swap arr[j] and arr[j+1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

}
