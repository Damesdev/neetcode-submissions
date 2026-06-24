class Solution {
    public int maxProfit(int[] prices) {
        int buyDay = 0;
        int sellDay = 1;
        int profit = 0;
        while (sellDay < prices.length){
            int currProfit = prices[sellDay] - prices[buyDay];
            if(prices[buyDay] >= prices[sellDay]){
                buyDay = sellDay;
                sellDay++;
            } else {
                profit = Math.max(currProfit, profit);
                sellDay++;
            }
        }

        return profit;
    }
}
