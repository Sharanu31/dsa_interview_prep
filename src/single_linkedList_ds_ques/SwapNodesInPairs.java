package single_linkedList_ds_ques;

public class SwapNodesInPairs {

	public static void main(String[] args) {
		int[] l1 = { 1, 2, 3, 4 };

		ListNode head = ListNode.arrayToLLConversion(l1);
		swapPairs(head);
	}

	public static ListNode swapPairs(ListNode head) {

		ListNode dummy = new ListNode(0, head);
		ListNode point = dummy;

		while (point.next != null && point.next.next != null) {
			ListNode swap1 = point.next;
			ListNode swap2 = point.next.next;

			swap1.next = point.next;
			swap2.next = swap1;

			point.next = swap2;
			point = swap1;
		}
		return dummy.next;

	}
}
