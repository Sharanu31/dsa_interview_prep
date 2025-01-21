package single_linkedList_ds_ques;

public class PartitionList {

	public static void main(String[] args) {
		int[] val = { 1, 4, 3, 2, 5, 2 };
		ListNode head = ListNode.arrayToLLConversion(val);
		int x = 3;
		partition(head, x);
	}

	public static ListNode partition(ListNode head, int x) {

		ListNode beforehead = new ListNode(-1);

		ListNode before = beforehead;

		ListNode afterhead = new ListNode(-1);

		ListNode after = afterhead;

		while (head != null) {
			if (head.val < x) {
				before.next = head;
				before = before.next;
			} else {
				after.next = head;
				after = after.next;
			}
			head = head.next;
		}
		after.next = null;
		before.next = afterhead.next;

		return beforehead.next;

	}
}
