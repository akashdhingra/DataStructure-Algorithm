class Solution {
    public int majorityElement(int[] nums) {
        return getMajorityElement(nums,0,nums.length-1);
    }
    
    public int getMajorityElement(int X[], int l, int r)
    {
        if (l==r)
            return X[l];
        
        int mid = l + (r-l)/2 ;
        int leftMajority = getMajorityElement(X,l,mid);
        int rightMajority = getMajorityElement(X,mid+1,r);
        if(leftMajority == rightMajority)
            return rightMajority;
        int leftCount = countFrequency(X,l,r, leftMajority);
        int rightCount = countFrequency(X,l,r, rightMajority);
        
        if(leftCount > rightCount)
            return leftMajority;
        return rightMajority;   
    }
    
    public int countFrequency(int X[],int l,int r, int Majority)
    {
        int count = 0;
        for (int i=l;i<=r;i++)
        {
            if(X[i] == Majority)
                count++;
        }
        return count;
    }
    
    
// Solution 1 - Complexity - O(nlogn)
//     public int majorityElement(int[] nums) {
        
//         
//         Arrays.sort(nums);
//         if(nums.length<2)
//             return nums[0];
//         else
//             return nums[nums.length/2];
        
//     }
}