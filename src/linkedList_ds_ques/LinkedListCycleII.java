package linkedList_ds_ques;

import java.util.HashMap;

public class LinkedListCycleII {

	public static void main(String[] args) {
		int[] val = { 3, 2, 0, -4 };
		ListNode head = ListNode.arrayToLLConversion(val);
		detectCycleHashUsingQueue(head);
	}

	public static ListNode detectCycleHashUsingQueue(ListNode head) {

		HashMap<ListNode, Integer> Hmap = new HashMap<ListNode, Integer>();
		ListNode dumy = head;
		while (dumy != null) {

		}
		return head;

	}

	public static ListNode detectCycleHash(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				slow = head;
				while (slow != fast) {
					slow = slow.next;
					fast = fast.next;
				}
				return slow;
			}

		}
		return null;
	}

}
