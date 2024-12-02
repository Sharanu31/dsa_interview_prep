package single_linkedList_ds_ques;

public class MiddleOfTheLinkedList {

	public static void main(String args[]) {

		int[] head = { 1, 2, 3,4, 4, 5 };
		ListNode node = ListNode.arrayToLLConversion(head);
		middleNode(node);
		middleNodeP(node);
	}

	// Using fast and slow pointers
	public static ListNode middleNodeP(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;

	}

	public static ListNode middleNode(ListNode head) {
		int nLen = nodeSize(head);
		int mid = (nLen / 2) + 1;
		ListNode node = head;
		while (node != null) {
			mid--;
			if (mid == 0) {
				// head = node;
				break;
			}
			node = node.next;
		}
		return node;
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
