package single_linkedList_ds_ques;

import java.util.HashMap;
import java.util.Map;

public class LinkedListCycle {

	public static void main(String[] args) {
		int[] head = { 3, 2, 0, -4 };

		ListNode node = ListNode.arrayToLLConversion(head);
		hasCycle(node);
		hasCycleh(node);
		hasCycleUsingingHash(node);

	}

	public static boolean hasCycle(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				return true;
			}
		}
		return false;
	}

	public static boolean hasCycleh(ListNode head) {
		ListNode slow_pointer = head, fast_pointer = head;
		while (fast_pointer != null && fast_pointer.next != null) {
			slow_pointer = slow_pointer.next;
			fast_pointer = fast_pointer.next.next;
			if (slow_pointer == fast_pointer) {
				return true;
			}
		}
		return false;
	}

	public static boolean hasCycleUsingingHash(ListNode head) {

		ListNode node = head;

		Map<ListNode, Integer> nMap = new HashMap<ListNode, Integer>();
		while (node != null) {

			if (nMap.containsKey(node)) {
				return true;
			}
			nMap.put(node, 1);
			node = node.next;
		}

		return false;

	}

}
