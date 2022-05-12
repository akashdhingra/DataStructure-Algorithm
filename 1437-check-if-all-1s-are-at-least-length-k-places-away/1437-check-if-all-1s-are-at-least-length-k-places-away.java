class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int pos = 0;
        int count = 0;
        while(pos<nums.length && nums[pos]==0)
            pos++;
        
        for(int i=pos+1;i<nums.length;i++)
        {
            if(nums[i]==0)
                count++;
            else
            {
                if(count < k)
                    return false;
                count = 0;
            }
        }
        return true;
        
    }
}