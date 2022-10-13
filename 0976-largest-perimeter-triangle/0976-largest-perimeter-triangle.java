class Solution {
    public int largestPerimeter(int[] nums) {
        int max_per = 0;
        nums = SortedArrayRev(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            if(nums[i] < nums[i+1] + nums[i+2])
            {
                max_per = Math.max(nums[i]+nums[i+1]+nums[i+2],max_per);
                break;
            }   
        }
        
        if(max_per > 0)
            return max_per;
        return 0;
    }
    
    public int[] SortedArrayRev(int[] nums)
    {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n/2;i++)
        {
            int temp = nums[i];
            nums[i] = nums[n-1-i];
            nums[n-1-i] = temp;
        }
        return nums;
    }
}