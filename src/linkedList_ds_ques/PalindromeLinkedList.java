package linkedList_ds_ques;

public class PalindromeLinkedList {

	public static void main(String[] args) {

		int[] head = { 1, 1, 2, 1 };
		ListNode headNode = ListNode.arrayToLLConversion(head);
		isPalindrome(headNode);
		isPalindromeOther(headNode);
	}

	public static boolean isPalindrome(ListNode head) {
		if (head == null) {
			return false;
		}
		if (head.next == null) {
			return true;
		}
		ListNode fast = head, slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		if (fast != null) {
			slow = slow.next;
		}
		slow = reverseList(slow);
		fast = head;
		while (slow != null) {
			if (fast.val != slow.val) {
				return false;
			}
			fast = fast.next;
			slow = slow.next;
		}
		return true;
	}

	private static ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		while (curr != null) {
			ListNode nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
		}
		head = prev;

		return head;
	}

	private static final int[] nums = new int[100000];

	public static boolean isPalindromeOther(ListNode head) {

		int[] c = nums;

		ListNode t = head;
		int total = 0;
		while (t != null) {
			c[total] = t.val;
			total++;
			t = t.next;
		}
		int s = 0;
		int e = total / 2;
		while (s < e) {
			if (c[s++] != c[--total])
				return false;
		}

		return true;
	}

}
