package linkedList_ds_ques;

public class FindLengthOfLoopLinkedListCycle {

	public static void main(String[] args) {

		int[] node = { 25, 14, 19, 33, 10, 21, 39, 90, 58, 45 };
		ListNode head = ListNode.arrayToLLConversion(node);
		countNodesinLoop(head);
	}

	public static int countNodesinLoop(ListNode head) {

		ListNode fast = head;
		ListNode slow = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return findLength(slow, fast);
			}
		}

		return 0;
	}

	private static int findLength(ListNode slow, ListNode fast) {
		int count = 1;
		fast = fast.next;
		while (slow != fast) {
			count++;
			fast = fast.next;
		}
		return count;

	}

}
