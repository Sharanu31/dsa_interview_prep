package array_ds_ques;

public class FinalPricesWithSpecialDiscountShop {

	public static void main(String[] args) {
		int[] prices = { 1, 2, 3, 4, 5 };
		finalPrices(prices);
		finalPricesOther(prices);
	}

	private static int[] finalPricesOther(int[] prices) {
		int[] res = new int[prices.length];
		int left = 0;
		while (left < prices.length) {
			res[left] = prices[left];
			for (int right = left + 1; right < prices.length; right++) {
				if (prices[right] <= prices[left]) {
					res[left] = prices[left] - prices[right];
					break;
				}
			}
			left++;
		}
		return res;
	}

	public static int[] finalPrices(int[] prices) {

		int[] res = new int[prices.length];
		int k = 0;
		for (int i = 0; i < prices.length; i++) {
			res[i] = prices[i];
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[j] <= prices[i]) {
					k = i;
					res[k] = prices[i] - prices[j];
					break;
				}
			}
		}

		return res;

	}
}