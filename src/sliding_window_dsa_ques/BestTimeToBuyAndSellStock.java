package sliding_window_dsa_ques;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {

		int[] prices = { 7, 1, 5, 3, 6, 4 };
		maxProfit(prices);
		maxProfitOpt(prices);
	}

	public static int maxProfit(int[] prices) {
		int maxProfit = 0, profit = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			int j = i + 1;
			while (j < prices.length && prices[i] < prices[j]) {
				profit = prices[j] - prices[i];
				maxProfit = Math.max(maxProfit, profit);
				j++;
			}
		}
		return maxProfit;

	}

	public static int maxProfitOpt(int[] prices) {

		// Optimal Sol 1
		int buy = prices[0], ans = 0;
		for (int i = 1; i < prices.length; i++) {
			ans = Math.max(ans, prices[i] - buy);
			buy = Math.min(buy, prices[i]);
		}

		System.out.println(ans);

		// Optimal Sol 2
		int minSoFar = Integer.MAX_VALUE;
		int maxProfit = Integer.MIN_VALUE;
		for (int i = 0; i < prices.length; i++) {
			minSoFar = Math.min(minSoFar, prices[i]);
			maxProfit = Math.max(prices[i] - minSoFar, maxProfit);
		}
		return maxProfit;
	}

	public static int maxProfitOP(int[] prices) {

		int max_profit = 0, profit = 0;
		int min_price = prices[0];

		for (int price : prices) {
			min_price = Math.min(min_price, price);
			profit = price - min_price;
			max_profit = Math.max(max_profit, profit);
		}

		return max_profit;
	}
}
