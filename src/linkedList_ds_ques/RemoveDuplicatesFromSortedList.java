package linkedList_ds_ques;

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 1, 2, 3, 3 };
		ListNode head = ListNode.arrayToLLConversion(a);
		deleteDuplicates(head);
	}

	public static ListNode deleteDuplicates(ListNode head) {

		ListNode node = head;
		ListNode prev = null;
		while (node.next != null) {

			if (prev != null && prev.val == node.val) {
				prev.next = node.next.next;
			} else {
				prev = node;

			}
			node = node.next;
		}

		return node;

	}

}
