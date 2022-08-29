class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k>n)
        {
            k = k%n;
        }
        
        if(n>1)
        {
            int temp[] = new int[n-k];
        for(int i=0;i<n-k;i++)
        {
            temp[i] = nums[i];
        }
        
        for(int j=n-k;j<n;j++)
        {
            nums[j-n+k] = nums[j];
        }
        
        for(int a=0;a<n-k;a++)
        {
            nums[a+k] = temp[a];
        }
    }
    }
}