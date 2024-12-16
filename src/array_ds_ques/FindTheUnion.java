package array_ds_ques;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindTheUnion {

	public static void main(String[] args) {
		int[] a = { 2, 2, 3, 4, 5 };
		int b[] = { 1, 1, 2, 3, 4 };
		brutefindUnion(a, b);
	}

	public static ArrayList<Integer> brutefindUnion(int a[], int b[]) {
		Set<Integer> s = new TreeSet<Integer>();
		for (int aa : a) {
			s.add(aa);
		}
		for (int bb : b) {
			s.add(bb);
		}

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int val : s) {
			list.add(val);
		}
		return list;
	}
}
