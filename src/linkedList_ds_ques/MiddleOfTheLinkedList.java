package linkedList_ds_ques;

public class MiddleOfTheLinkedList {

	public static void main(String args[]) {

		int[] head = { 1, 2, 3, 4, 5 };
		ListNode node = ListNode.arrayToLLConversion(head);
		middleNode(node);
	}

	public static ListNode middleNode(ListNode head) {
		int nLen = nodeSize(head);
		int mid = nLen / 2;
		int count = 0;
		if (nLen % 2 == 0) {
			if (mid == count) {

			}
		} else {

		}
		return head;
	}

	static int nodeSize(ListNode head) {
		int count = 0;
		while (head != null) {
			count++;
			head = head.next;
		}
		return count;

	}
}
