package linkedList_ds_ques;

public class OddEvenLinkedList {

	public static void main(String[] args) {
		int[] head = { 1, 2, 3, 4, 5 };

		ListNode node = ListNode.arrayToLLConversion(head);
		oddEvenList(node);
	}

	public static ListNode oddEvenList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode odd = head;
		ListNode even = head.next;
		ListNode evenHead = even;
		while (even != null && even.next != null) {
			odd.next = odd.next.next;
			even.next = even.next.next;
			odd = odd.next;
			even = even.next;
		}
		odd.next = evenHead;
		return head;
	}
}
