package linkedList_ds_ques;

class Node01 {
	int data; // Holds the integer value of the node.
	Node01 next; // Holds a reference to the next node in the linked list.

	Node01(int data, Node01 next) {
		this.data = data;
		this.next = next;
	}

	Node01(int data) {
		this.data = data;
		this.next = null;
	}
}

public class ArrayToLLConversion {
	static Node01 arrayToLLConversion(int[] arr) {
		Node01 head = new Node01(arr[0]);
		Node01 mover = head;
		for (int i = 1; i < arr.length; i++) {
			Node01 temp = new Node01(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		return head;
	}

	static void traversingLL(Node01 head) {
		Node01 temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	static int lengthOfLL(Node01 head) {
		int count = 0;
		Node01 temp = head;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}

	static Node01 removeValue(Node01 head, int val) {

		Node01 temp = head;
		Node01 prev = null;
		while (temp != null) {
			if (temp.data == val) {
				prev.next = prev.next.next;
				break;
			}
			prev = temp;
			temp = temp.next;
		}

		return head;

	}

	static Node01 removeKthPosEle(Node01 head, int k) {

		if (head == null)
			return head;
		if (k == 1) {
			Node01 temp = head;
			temp = temp.next;
			head = temp;
			return head;
		}
		int count = 0;
		Node01 prev = null;
		Node01 temp = head;
		while (temp != null) {
			count++;
			if (count == k) {
				prev.next = prev.next.next;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		return head;
	}

	public static Node01 deletionOfHead(Node01 head) {
		if (head == null)
			return null;
		else
			head = head.next;
		return head;

	}

	// Nothing but the last element of LL
	public static Node01 deletionOfTail(Node01 head) {
		if (head == null || head.next == null)
			return null;
		Node01 temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		return head;
	}

	private static int searchInLL(Node01 head, int val) {
		Node01 temp = head;
		while (temp != null) {
			if (temp.data == val) {
				return 1;
			}
			temp = temp.next;
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		Node01 head = arrayToLLConversion(a);
		System.out.println(head.data);
		System.out.println();
		System.out.print("Traversing LL : ");
		traversingLL(head);
		System.out.println("Length of LL : " + lengthOfLL(head));
		int val = 5;
		System.out.printf("Searching for value %s: %s%n", val, searchInLL(head, val));

		// Deletion In LL - starts
		Node01 afterDeletionHead = deletionOfHead(head);
		System.out.println("Deletion of Head : ");
		traversingLL(afterDeletionHead);

		Node01 afterDeletionTail = deletionOfTail(head);
		System.out.println("Deletion of Tail : " + afterDeletionTail);
		traversingLL(afterDeletionTail);

		Node01 deletingKthPosition = removeKthPosEle(head, 1);
		System.out.println("Deletion of Kth Position that is 1st position : " + deletingKthPosition);
		traversingLL(deletingKthPosition);

		Node01 deletingKthPosition01 = removeKthPosEle(head, 2);
		System.out.println("Deletion of Kth Position that is 2st position : " + deletingKthPosition01);
		traversingLL(deletingKthPosition01);

		int[] aa = { 12, 25, 37, 49, 56 };
		Node01 newHead = arrayToLLConversion(aa);
		int value = 56;
		Node01 ewmoveValue = removeValue(newHead, value);
		System.out.printf("Deleting Particular value %s: ", value);
		traversingLL(ewmoveValue);
		// Deletion In LL - end

		// Insertion in LL - starts

		int[] b = { 25, 42, 98, 63, 12, 77, 20 };
		Node01 head02 = arrayToLLConversion(b);

		Node01 insertionAtHead = insertionAtTheHead(head02, 10);
		System.out.printf("Insertion at the head %n");
		traversingLL(insertionAtHead);

		Node01 insertionAtTail = insertionAtTheTail(head02, 87);
		System.out.printf("Insertion at the head %n");
		traversingLL(insertionAtTail);
		// Insertion in LL - ends
	}

	private static Node01 insertionAtTheTail(Node01 head02, int i) {
		Node01 node = head02;
		while (node.next != null) {
			node = node.next;
		}
		Node01 newN = new Node01(i);
		node.next = newN;
		return head02;
	}

	private static Node01 insertionAtTheHead(Node01 head02, int i) {
		return new Node01(i, head02);
	}

}
