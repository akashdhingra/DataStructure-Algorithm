class Solution {
    public int findGCD(int[] nums) {
        int n=0;
        int smallest = nums[0];
        int largest = nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<smallest)
            {
                smallest = nums[i];
            }
            
            if(nums[i]>largest)
            {
                largest = nums[i];
            }
        }
        
        for(int j= 1; j <= smallest; j++)
        {
            if((largest % j == 0) && (smallest % j == 0) )
                n = j;
        }
        return n;
        
    }
}