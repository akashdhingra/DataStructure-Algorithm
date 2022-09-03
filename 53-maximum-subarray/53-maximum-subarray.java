class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int max_so_far=nums[0];
//         for(int i=0;i<nums.length;i++)
//         {
//             max = max + nums[i];
//             if(max>max_so_far)
//                 max_so_far = max;
            
//             if(max<0)
//                 max = 0;
//         }
//         return max_so_far;
        for(int i=1;i<nums.length;i++)
        {
            max_so_far = Math.max(max_so_far + nums[i],nums[i]);
            max = Math.max(max_so_far,max);
        }
        return max;
        
    }
}