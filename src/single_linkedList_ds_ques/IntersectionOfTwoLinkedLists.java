package single_linkedList_ds_ques;

public class IntersectionOfTwoLinkedLists {

	public static void main(String[] args) {
		int[] listA = { 4, 1, 8, 4, 5 };
		int[] listB = { 5, 6, 1, 8, 4, 5 };

		ListNode nodeA = ListNode.arrayToLLConversion(listA);
		ListNode nodeB = ListNode.arrayToLLConversion(listB);
		ListNode a = getIntersectionNode(nodeA, nodeB);
		System.out.println(a);
		getIntersectionNode01(nodeA, nodeB);
		getIntersectionNodTUFlogic(ListNode.arrayToLLConversion(listA), ListNode.arrayToLLConversion(listB));
	}

	private static ListNode getIntersectionNodTUFlogic(ListNode head1, ListNode head2) {
		ListNode temp1 = head1;
		ListNode temp2 = head2;
		while (temp1 != temp2) {

			// Sharanu

			temp1 = temp1.next;
			temp2 = temp2.next;

			if (temp1 == temp2)
				return temp1;

			if (temp1 == null)
				temp1 = head2;
			if (temp2 == null)
				temp2 = head1;

		}
		return temp1;

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
