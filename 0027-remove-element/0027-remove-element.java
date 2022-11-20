class Solution {
    public int removeElement(int[] nums, int val) {
        int num = nums.length;
        int i=0;
        for(int k=0;k<num;k++)
        {
            if(nums[k]!=val){
                nums[i]=nums[k];
                i++;
            }
        }
        
        return i;
    }
}