// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0

class BstTimeToBuyNSellStock {
    public int maxProfit(int[] prices) {

        int left = 0, bestProfit = 0;

        for (int right = 1; right < prices.length; right++) {
            if (prices[right] < prices[left]) {
                // Updates the minimum leftmost value
                left = right;
            } else {
                bestProfit = Math.max(bestProfit, prices[right] - prices[left]);
            }
        }
        return bestProfit;
    }
}
