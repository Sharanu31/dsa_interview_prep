package linkedList_ds_ques;

public class ListNode {

	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	static ListNode arrayToLLConversion(int[] arr) {
		ListNode head = new ListNode(arr[0]);
		ListNode mover = head;
		for (int i = 1; i < arr.length; i++) {
			ListNode temp = new ListNode(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		return head;
	}
}
