class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int left = 0; left < prices.length; left++){
            int buy = prices[left];
            for(int right = left + 1; right < prices.length; right++){
                int sell = prices[right];
                profit = Math.max(profit, sell - buy);
            }
        }
        
        return profit;
    }
}
