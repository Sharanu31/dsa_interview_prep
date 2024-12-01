package linkedList_ds_ques;

public class DeleteTheMiddleNodeOfLinkedList {

	public static void main(String[] args) {
		int[] head = { 1, 2, 3, 4 };
		ListNode node = ListNode.arrayToLLConversion(head);
		deleteMiddle(node);
		deleteMiddleOpt(ListNode.arrayToLLConversion(head));
	}

	private static ListNode deleteMiddleOpt(ListNode head) {
		if (head == null || head.next == null) {
			return null;
		}
		ListNode slow = head;
		ListNode fast = head;
		fast = head.next.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		slow.next = slow.next.next;
		return head;
	}

	public static ListNode deleteMiddle(ListNode head) {

		if (head == null || head.next == null) {
			return null;
		}

		ListNode dum = new ListNode(-1);
		dum.next = head;
		ListNode curr = dum;
		int length = sizeOfNode(head);
		int mid = length / 2;
		int count = 0;
		while (curr != null) {
			if (count == mid) {
				curr.next = curr.next.next;
				break;
			}
			count++;
			curr = curr.next;

		}
		return dum.next;

	}

	private static int sizeOfNode(ListNode head) {
		int count = 0;
		while (head != null) {
			head = head.next;
			count++;
		}
		return count;
	}
}
