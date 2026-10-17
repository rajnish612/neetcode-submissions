class Solution {

    //Time complexity O(n) and space complexity O(1)
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int currProfit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, currProfit);
            minPrice = Math.min(prices[i], minPrice);
        }
        return maxProfit;
    }
}
