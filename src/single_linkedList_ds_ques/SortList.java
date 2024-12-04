package single_linkedList_ds_ques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		int[] head = { 4, 2, 1, 3 };
		ListNode node = ListNode.arrayToLLConversion(head);
		// sortListBrute(node);
		sortListBruteOptimsl(ListNode.arrayToLLConversion(head));
	}

	public static ListNode sortListBrute(ListNode head) {
		ListNode temp = head;
		List<Integer> li = new ArrayList<Integer>();
		while (temp != null) {
			li.add(temp.val);
			temp = temp.next;
		}
		Collections.sort(li);
		int count = 0;
		temp = head;
		while (temp != null) {
			temp.val = li.get(count);
			count++;
			temp = temp.next;
		}
		return head;

	}

	public static ListNode sortListBruteOptimsl(ListNode head) {

		int size = size(head);
		int right = size - 1;
		int left = 0;
		ListNode newHead = head;
		int[] toArray = convertToArray(head, size);
		int temp[] = mergeSort(toArray, left, right);
		for (int i = 0; i < temp.length; i++) {
			newHead.val = temp[i];
		}

		return head;
	}

	private static int[] mergeSort(int[] toArray, int low, int high) {
		int mid = low + (high - low) / 2;
		mergeSort(toArray, low, mid);
		mergeSort(toArray, mid + 1, high);
		int[] arr = merge(toArray, low, mid, high);
		return arr;
	}

	private static int[] merge(int[] arr, int low, int mid, int high) {
		ArrayList<Integer> temp = new ArrayList<>(); // temporary array
		int left = low; // starting index of left half of arr
		int right = mid + 1; // starting index of right half of arr

		// storing elements in the temporary array in a sorted manner//

		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			} else {
				temp.add(arr[right]);
				right++;
			}
		}

		// if elements on the left half are still left //

		while (left <= mid) {
			temp.add(arr[left]);
			left++;
		}

		// if elements on the right half are still left //
		while (right <= high) {
			temp.add(arr[right]);
			right++;
		}

		// transfering all elements from temporary to arr //
		for (int i = low; i <= high; i++) {
			arr[i] = temp.get(i - low);
		}

		return arr;
	}

	private static int[] convertToArray(ListNode head, int size) {
		int[] temp = new int[size];
		for (int i = 0; i <= size - 1; i++) {
			temp[i] = head.val;
			head = head.next;
		}
		return temp;
	}

	private static int size(ListNode head) {
		int count = 0;
		while (head != null) {
			count++;
			head = head.next;
		}
		return count;
	}
}
