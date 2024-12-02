package single_linkedList_ds_ques;

public class MergeTwoSortedLists {

	public static void main(String[] args) {

		int[] list1 = { 1, 2, 4 };
		int[] list2 = { 1, 3, 4 };

		ListNode node1 = ListNode.arrayToLLConversion(list1);
		ListNode node2 = ListNode.arrayToLLConversion(list2);
		mergeTwoLists(node1, node2);
	}

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode head = new ListNode();
		ListNode present = head;
		while (list1 != null & list2 != null) {
			if (list1.val > list2.val) {
				present.next = list2;
				list2 = list2.next;
			} else {
				present.next = list1;
				list1 = list1.next;
			}
			present = present.next;
		}
		present.next = (list1 != null) ? list1 : list2;
		return head.next;
	}
}
