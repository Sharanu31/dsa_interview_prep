package single_linkedList_ds_ques;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromSortedListII {

	public static void main(String[] args) {
		int[] head = { -3, -1, 0, 0, 0, 3, 3 };
		ListNode node = ListNode.arrayToLLConversion(head);
		deleteDuplicates(node);
	}

	public static ListNode deleteDuplicates(ListNode head) {
		Map<Integer, Integer> val = new HashMap<Integer, Integer>();
		while (head != null) {

			val.put(head.val, val.getOrDefault(head.val, 0) + 1);
			head = head.next;
		}
		List<Integer> lis = val.entrySet().stream().filter(a -> a.getValue() == 1).map(Entry::getKey)
				.collect(Collectors.toList());
		Collections.sort(lis);
		ListNode dum = new ListNode(-1);
		ListNode mover = dum;
		for (int i = 0; i < lis.size(); i++) {
			ListNode temp = new ListNode(lis.get(i));
			mover.next = temp;
			mover = temp;
		}
		return dum.next;
	}
}
