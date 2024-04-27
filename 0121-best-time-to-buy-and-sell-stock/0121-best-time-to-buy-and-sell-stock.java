class Solution {
    public int maxProfit(int[] prices) {
        int minValue = prices[0];
        int profit = 0;
        int n = prices.length;
        for(int i=1;i<n;i++){
            int cost = prices[i] - minValue;
            profit = Math.max(profit, cost);
            minValue = Math.min(minValue,prices[i]);
        }
        return profit;
    }
}