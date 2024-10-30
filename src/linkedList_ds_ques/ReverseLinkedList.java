package linkedList_ds_ques;

public class ReverseLinkedList {

	public static void main(String[] args) {
		int[] head = { 1, 2, 3, 4, 5 };
		ListNode h = ListNode.arrayToLLConversion(head);
		reverseList(h);
	}

	public static ListNode reverseList(ListNode head) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return head;
		}
		ListNode preNode = null;
		ListNode currNode = head;
		while (currNode != null) {
			ListNode nextNode = currNode.next;
			currNode.next = preNode;
			preNode = currNode;
			currNode = nextNode;
		}
		head = preNode;
		return head;
	}
}
