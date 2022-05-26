class Solution {
    public int maximumDifference(int[] nums) {
        int max = -1;
        int diff = 0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j] > nums[i])
                {
                    diff = nums[j]-nums[i];
                    if(diff> max)
                        max=diff;
                }
            }
        }
        return max;
    }
}