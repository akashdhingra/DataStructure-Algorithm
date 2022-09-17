class Solution {
    public int findPeakElement(int[] nums) {
        //applied binary search
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            
            // if mid is starting or ending then return mid
            // or if mid is greater than previous and next element
            // then return mid
            
            if((mid ==0 || nums[mid-1] <=nums[mid]) && 
               (mid==n-1 || nums[mid+1] <=nums[mid]))
                return mid;
            
            // if mid is less than previous element then
            // definately peak element is to the left of mid
            // as for the element to be peak, both next and previous
            // element must be smaller.
            
            if(mid >0 && nums[mid-1] >= nums[mid])
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
        
    }
}