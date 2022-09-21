class Solution {
    public void sortColors(int[] nums) {
        // This is simple bubble sort
        int n = nums.length;
        int temp = 0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(nums[j] > nums[j+1])
                {
                    nums[j] = nums[j] + nums[j+1];
                    nums[j+1] = nums[j] - nums[j+1];
                    nums[j] = nums[j] - nums[j+1];
                }
            
            }
        }
    }
}