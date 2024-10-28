package array_ds_ques;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		maxProfit(prices);
	}

	public static int maxProfit(int[] prices) {
		int max_profit = 0;
		int min_price = prices[0];
		for (int price : prices) {
			min_price = Math.min(min_price, price);
			price = price - min_price;
			max_profit = Math.max(max_profit, price);
		}
		return max_profit;
	}
}
