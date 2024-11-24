package linkedList_ds_ques;

import java.util.Stack;

public class ReverseLinkedList {

	public static void main(String[] args) {
		int[] head = { 1, 2, 3, 4, 5 };
		ListNode h = ListNode.arrayToLLConversion(head);
		reverseList(h);

		ListNode h1 = ListNode.arrayToLLConversion(head);
		reverseListWithStack(h1);
	}

	public static ListNode reverseList(ListNode head) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return head;
		}
		ListNode preNode = null;
		ListNode currNode = head;
		while (currNode != null) {
			ListNode nextNode = currNode.next;
			currNode.next = preNode;
			preNode = currNode;
			currNode = nextNode;
		}
		head = preNode;
		return head;
	}

	public static ListNode reverseListWithStack(ListNode head) {

		Stack<ListNode> stack = new Stack<ListNode>();
		ListNode it = head;
		while (it != null) {
			stack.add(it);
			it = it.next;
		}
		// Pop from the stack to reverse the list
		ListNode newHead = stack.pop(); // The new head of the reversed list
		ListNode curr = newHead; // Pointer to construct the reversed list

		while (!stack.isEmpty()) {
			curr.next = stack.pop(); // Connect to the next node
			curr = curr.next;
		}

		curr.next = null; // Ensure the last node points to null
		return newHead;

	}
}
