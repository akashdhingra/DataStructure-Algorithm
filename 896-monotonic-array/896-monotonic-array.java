class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean decrease = true;
        boolean increase = true;
        for(int i=1;i<nums.length;i++)
        {
            decrease &= nums[i-1] >= nums[i];
            increase &= nums[i-1] <= nums[i];
        }
        
        return (increase || decrease);
        
    }
}