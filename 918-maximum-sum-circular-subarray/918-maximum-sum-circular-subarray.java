class Solution {
    
    public int normal_max_sum(int [] arr)
    {
        int n = arr.length;
        int res = arr[0];
        int max_ending = arr[0];
        for(int i=1;i<n;i++)
        {
           max_ending = Math.max(max_ending + arr[i], arr[i]);
           res = Math.max(max_ending,res); 
        }
        
        return res;
    }
    
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int max_normal_sum = normal_max_sum(nums);
        if(max_normal_sum < 0)
            return max_normal_sum;
        
        int arr_sum = 0;
        
        for(int j=0;j<n;j++)
        {
            arr_sum = arr_sum + nums[j];
            nums[j] = -nums[j];
        }
        
        int arr_circular_sum = normal_max_sum(nums) + arr_sum;
        
        return Math.max(max_normal_sum, arr_circular_sum);       
    }
}