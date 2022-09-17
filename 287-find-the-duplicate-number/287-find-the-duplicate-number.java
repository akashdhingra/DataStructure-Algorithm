class Solution {
    public int findDuplicate(int[] nums) {
        //created the boolean as length of nums
        // by default all are of false value
        boolean b[] = new boolean[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            // set of the value of indexes of b
            // according to value of nums as true
            // means set visited as true
            // if value repeats again then it will returned as it is already true.
            
            if(b[nums[i]])
                return nums[i];
            b[nums[i]] = true;
        }
        return -1;
    }
}