package two_pointer_dsa_ques;

public class PracticeTwo {

	public static void main(String args[]) {
		PracticeTwo ob = new PracticeTwo();
		int ar1[] = { 1, 4, 5, 7 };
		int ar2[] = { 10, 20, 30, 40 };
		int m = ar1.length;
		int n = ar2.length;
		int x = 38;
		ob.printClosest(ar1, ar2, m, n, x);
	}

	void printClosest(int ar1[], int ar2[], int m, int n, int x) {
		int diff = Integer.MAX_VALUE;
		int res_l = 0, res_r = 0;
		int l = 0, r = n - 1;
		while (l < m && r >= 0) {
			if (Math.abs(ar1[l] + ar2[r] - x) < diff) {
				res_l = l;
				res_r = r;
				diff = Math.abs(ar1[l] + ar2[r] - x);
			}
			if (ar1[l] + ar2[r] > x)
				r--;
			else // move to the greater side
				l++;
		}
		System.out.print("The closest pair is [" + ar1[res_l] + ", " + ar2[res_r] + "]");
	}

}
