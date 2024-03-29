class Solution {
    public void sortColors(int[] nums) {
        // This is simple bubble sort
        // for optimization we can run the inner loop
        // until n-i-1, because after each the last element gets
        // sorted
        boolean swapped = false;
        int n = nums.length;
        int temp = 0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(nums[j] > nums[j+1])
                {
                    nums[j] = nums[j] + nums[j+1];
                    nums[j+1] = nums[j] - nums[j+1];
                    nums[j] = nums[j] - nums[j+1];
                    swapped = true;
                }
            
            }
            // if no swapping is done then it means that it is already sorted.
            // so no need to run the loop n^2 times.
            if(swapped == false)
                break;
        }
    }
}