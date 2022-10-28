// Two sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a = nums.length;
        int arr[] = new int[2];
        
        for(int i=0;i<a;i++)
        {
            for(int j=i+1;j<a;j++)
            {
                if((nums[i]+nums[j])==target){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
                                        
            }
        }
        return arr;
        
    }
}