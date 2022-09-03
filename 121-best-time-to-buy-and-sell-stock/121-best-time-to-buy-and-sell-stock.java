class Solution {
    public int maxProfit(int[] prices) {
        int least_num = Integer.MAX_VALUE;
        int n = prices.length;
        int sold_today = 0;
        int prof = 0;
        for(int i=0;i<n;i++)
        {
            if(prices[i] < least_num)
            {
                least_num = prices[i];
            }
            
            sold_today = prices[i] - least_num;
            if(prof < sold_today)
            {
                prof = sold_today;
            }
        }
        return prof;
    }
}