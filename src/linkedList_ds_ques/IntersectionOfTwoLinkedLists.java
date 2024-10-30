package linkedList_ds_ques;

public class IntersectionOfTwoLinkedLists {

	public static void main(String[] args) {
		int[] listA = { 4, 1, 8, 4, 5 };
		int[] listB = { 5, 6, 1, 8, 4, 5 };

		ListNode nodeA = ListNode.arrayToLLConversion(listA);
		ListNode nodeB = ListNode.arrayToLLConversion(listB);
		getIntersectionNode(nodeA, nodeB);
		getIntersectionNode01(nodeA, nodeB);
	}

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int nodeAL = getLengthOf(headA);
		int nodeBL = getLengthOf(headB);
		while (nodeAL > nodeBL) {
			nodeAL--;
			headA = headA.next;
		}
		while (nodeAL < nodeBL) {
			nodeBL--;
			headB = headB.next;
		}
		while (headA != headB) {
			headA = headA.next;
			headB = headB.next;
		}

		return headA;
	}

	private static int getLengthOf(ListNode head) {
		int count = 0;
		if (head == null)
			return 0;
		while (head != null) {
			count++;
			head = head.next;
		}
		return count;
	}

	public static ListNode getIntersectionNode01(ListNode headA, ListNode headB) {
		int ac = 0;
		int bc = 0;
		ListNode a = headA;
		ListNode b = headB;
		while (a != null) {
			ac++;
			a = a.next;
		}
		while (b != null) {
			bc++;
			b = b.next;
		}
		while (ac > bc) {
			ac--;
			headA = headA.next;
		}
		while (bc > ac) {
			bc--;
			headB = headB.next;
		}
		while (headA != headB) {
			headA = headA.next;
			headB = headB.next;
		}
		return headA;
	}

}
