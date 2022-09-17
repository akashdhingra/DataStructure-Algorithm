class Solution {
    public int findDuplicate(int[] nums) {
        boolean b[] = new boolean[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(b[nums[i]])
                return nums[i];
            b[nums[i]] = true;
        }
        return -1;
    }
}