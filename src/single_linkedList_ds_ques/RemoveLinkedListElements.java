package single_linkedList_ds_ques;

public class RemoveLinkedListElements {

	public static void main(String[] args) {

		int[] head = { 1, 2, 6, 3, 4, 5, 6 };
		int val = 6;
		ListNode node = ListNode.arrayToLLConversion(head);
		removeElements(node, val);
	}

	public static ListNode removeElements(ListNode head, int val) {
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode curr = dummy;
		while (curr.next != null) {
			if (curr.next.val == val) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}
		}
		return dummy.next;

	}
}
