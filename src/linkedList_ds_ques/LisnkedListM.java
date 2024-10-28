package linkedList_ds_ques;

class Node {

	int value; // Holds the integer value of the node.
	Node node; // Holds a reference to the next node in the linked list.

	Node(int val, Node node) {
		this.value = val;
		this.node = node;
	}

	Node(int val) {
		this.value = val;
		this.node = null;
	}
}

public class LisnkedListM {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		Node y = new Node(a[0], null);
		System.out.println(y);
	}

}
