package single_linkedList_ds_ques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
	public static ListNode sortListBrute1(ListNode head) {
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

	// Function to merge two sorted linked lists
	static ListNode mergeTwoSortedLinkedLists(ListNode list1, ListNode list2) {
		// Create a dummy ListNode to serve
		// as the head of the merged list
		ListNode dummyListNode = new ListNode(-1);
		ListNode temp = dummyListNode;

		// Traverse both lists simultaneously
		while (list1 != null && list2 != null) {
			// Compare elements of both lists and
			// link the smaller ListNode to the merged list
			if (list1.val <= list2.val) {
				temp.next = list1;
				list1 = list1.next;
			} else {
				temp.next = list2;
				list2 = list2.next;
			}
			// Move the temporary pointer
			// to the next ListNode
			temp = temp.next;
		}

		// If any list still has remaining
		// elements, append them to the merged list
		if (list1 != null) {
			temp.next = list1;
		} else {
			temp.next = list2;
		}
		// Return the merged list starting
		// from the next of the dummy ListNode
		return dummyListNode.next;
	}

	// Function to find the middle of a linked list
	static ListNode findMiddle(ListNode head) {
		// If the list is empty or has only one ListNode
		// the middle is the head itself
		if (head == null || head.next == null) {
			return head;
		}

		// Initializing slow and fast pointers
		ListNode slow = head;
		ListNode fast = head.next;

		// Move the fast pointer twice
		// as fast as the slow pointer
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		// When the fast pointer reaches the end,
		// the slow pointer will be at the middle
		return slow;
	}

	// Function to perform merge sort on a linked list
	static ListNode sortLL(ListNode head) {
		// Base case: if the list is empty or
		// has only one ListNode, it is already
		// sorted, so return the head
		if (head == null || head.next == null) {
			return head;
		}

		// Find the middle of the list
		// using the findMiddle function
		ListNode middle = findMiddle(head);

		// Divide the list into two halves
		ListNode right = middle.next;
		middle.next = null;
		ListNode left = head;

		// Recursively sort the left and right halves
		left = sortLL(left);
		right = sortLL(right);

		// Merge the sorted halves using the
		// mergeTwoSortedLinkedLists function
		return mergeTwoSortedLinkedLists(left, right);
	}

	// Function to print the linked list
	static void printLinkedList(ListNode head) {
		ListNode temp = head;
		while (temp != null) {
			// Print the val of the current ListNode
			System.out.print(temp.val + " ");
			// Move to the next ListNode
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Linked List: 3 2 5 4 1
		ListNode head = new ListNode(3);
		head.next = new ListNode(2);
		head.next.next = new ListNode(5);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(1);

		System.out.print("Original Linked List: ");
		printLinkedList(head);

		// Sort the linked list
		head = sortLL(head);

		System.out.print("Sorted Linked List: ");
		printLinkedList(head);
	}
}
