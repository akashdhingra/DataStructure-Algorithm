class Solution {
    public int findClosestNumber(int[] nums) {
        int distance = Integer.MAX_VALUE;
        int n = nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(distance > Math.abs(nums[i]) )
            {
                distance = Math.abs(nums[i]);
                n = nums[i];
            }
            
            else if(distance == Math.abs(nums[i]) && n < nums[i])
                n = nums[i];
                
        }
        
        return n;
        
    }
}