class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int max_count = nums[0];
        int sum = nums[0];
        int min_count = nums[0];
        int min_sum = nums[0];
        for(int i=1;i<n;i++)
        {
           sum = Math.max(sum + nums[i], nums[i]);
           max_count = Math.max(sum,max_count); 
        }
        
        if(max_count < 0)
            return max_count;
        
        for(int j=1;j<n;j++)
        {
           min_sum = Math.min(min_sum + nums[j], nums[j]);
           min_count = Math.min(min_sum,min_count); 
        }

        int initial_sum = 0;
        
        for(int k=0;k<n;k++)
        {
           initial_sum = initial_sum + nums[k]; 
        }
        
        int final_sum = initial_sum - min_count;
        
        int final_result = Math.max(final_sum,max_count);
        
        return final_result;
        
    }
}