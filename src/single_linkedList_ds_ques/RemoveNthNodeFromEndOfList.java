package single_linkedList_ds_ques;

public class RemoveNthNodeFromEndOfList {

	public static void main(String[] args) {

		int[] head = { 1, 2, 3, 4, 5 };

		ListNode node = ListNode.arrayToLLConversion(head);
		int n = 2;
		removeNthFromEnd(node, n);
		removeNthFromEndOthers(node, n);
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		int totoSize = sizeOfNode(head);

		int remove = totoSize - n;
		ListNode dum = new ListNode(-1);
		dum.next = head;
		ListNode curr = dum;
		int count = 0;
		while (curr.next != null) {
			if (count == remove) {
				curr.next = curr.next.next;
				break;
			}
			curr = curr.next;
			count++;
		}
		dum = dum.next;
		return dum;

	}

	static int sizeOfNode(ListNode head) {
		int count = 0;
		while (head != null) {
			count++;
			head = head.next;
		}

		return count;
	}

	public static ListNode removeNthFromEndOthers(ListNode head, int n) {
		ListNode fast = head, slow = head;
		for (int i = 0; i < n; i++)
			fast = fast.next;
		if (fast == null)
			return head.next;
		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return head;
	}
}
