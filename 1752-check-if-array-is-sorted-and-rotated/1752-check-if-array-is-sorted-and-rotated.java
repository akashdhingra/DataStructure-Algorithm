class Solution {
    public boolean check(int[] nums) {
        int sort = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] > nums[(i+1) % nums.length])
                sort++;
            if(sort > 1)
                return false;
        }
        return true;
    }
}