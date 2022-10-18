class Solution {
    public int maxSubArray(int[] nums) {
        int max_value = nums[0];
        int max_so_far=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            max_so_far = Math.max(max_so_far + nums[i],nums[i]);
            max_value = Math.max(max_so_far,max_value);
        }
        return max_value;
        
    }
}