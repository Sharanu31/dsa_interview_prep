package linkedList_ds_ques;

public class RotateList {

	public static void main(String[] args) {
		int[] head = { 1, 2, 3, 4, 5 };
		ListNode node = ListNode.arrayToLLConversion(head);
		int k = 2;
		rotateRight(node, k);

	}

	public static ListNode rotateRight(ListNode head, int k) {
		if (head == null || k == 0) {
			return head;
		}
		int len = 1;
		ListNode tail = head;
		while (tail.next != null) {
			len++;
			tail = tail.next;
		}
		if (k % len == 0) {
			return head;
		}
		k = k % len;
		tail.next = head;

		ListNode newLastNode = findNthNode(head, len - k);
		head = newLastNode.next;
		newLastNode.next = null;

		return head;

	}

	private static ListNode findNthNode(ListNode head, int i) {

		int length = 0;
		while (head != null) {
			length++;
			if (length == i) {
				return head;
			}
			head = head.next;
		}

		return null;
	}
}
