package single_linkedList_ds_ques;

public class ReverseLinkedListII {

	public static void main(String[] args) {

		int[] head = { 1, 2, 3, 4, 5 };
		int left = 2, right = 4;

		ListNode node = ListNode.arrayToLLConversion(head);
		ListNode finalNode = reverseBetween(node, left, right);

	}

	public static ListNode reverseBetween(ListNode head, int left, int right) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode leftPre = dummy;
		ListNode currNode = head;
		for (int i = 0; i < left - 1; i++) {
			leftPre = leftPre.next;
			currNode = currNode.next;
		}
		ListNode subListHead = currNode;
		ListNode preNode = null;
		for (int i = 0; i <= right - left; i++) {
			ListNode nextNode = currNode.next;
			currNode.next = preNode;
			preNode = currNode;
			currNode = nextNode;
		}
		leftPre.next = preNode;
		subListHead.next = currNode;
		return dummy.next;
	}
}
