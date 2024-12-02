package double_linkedList_ds_ques;

class DListNode {

	int val;

	DListNode next;

	DListNode back;

	DListNode() {

	}

	DListNode(int val, DListNode next, DListNode back) {
		this.val = val;
		this.next = next;
		this.back = back;
	}

	public DListNode(int val) {
		this.val = val;
	}

}

class DtoArray {
	static DListNode arraytoDLL(int[] arr) {

		DListNode head = new DListNode(arr[0]);
		DListNode prev = head;
		for (int i = 1; i < arr.length; i++) {
			DListNode temp = new DListNode(arr[i], null, prev);
			prev.next = temp;
			prev = temp;
		}

		return head;

	}
}

class PrintDLL {

	public static void printDLL(DListNode head) {
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}

public class DoubleLinkedListCreate {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 31, 4, 15, 6 };
		DListNode head = DtoArray.arraytoDLL(arr);
		PrintDLL.printDLL(head);
		System.out.println("Deleting Head ");
		PrintDLL.printDLL(deleteHeadofDll(DtoArray.arraytoDLL(arr)));
		System.out.println("Deleting Tail ");
		PrintDLL.printDLL(deleteTailofDll(DtoArray.arraytoDLL(arr)));
	}

	private static DListNode deleteTailofDll(DListNode head) {
		if (head == null || head.next == null) {
			return null;
		}

		DListNode tail = head;
		while (tail.next != null) {
			tail = tail.next;
		}

		DListNode prev = tail.back;
		prev.next = null;
		tail.back = null;
		return head;

	}

	private static DListNode deleteHeadofDll(DListNode head) {
		if (head == null || head.next == null) {
			return null;
		}
		DListNode pre = head;
		head = head.next;
		head.back = null;
		pre.next = null;
		return head;

	}

}
