class Solution {
    public int smallestEqual(int[] nums) {
        int count = 0;
        int value = nums.length;
        for(int i=0; i< nums.length; i++)
        {
            if((i%10) == nums[i] && i< value)
            {
                count++;
                value = i;
            }
            
        }
        if(count == 0)
                value = -1;
        return value;
        
    }
}
