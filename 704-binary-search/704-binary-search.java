class Solution {
    
    public int binarysearch(int[] arr, int left, int right, int target)
    {
        int mid = (left+right)/2;
        
        if(left > right || mid == arr.length )
            return -1;
        
        if(arr[mid] == target)
            return mid;
        
        if(arr[mid] > target)
        {
            return binarysearch(arr,left,mid-1, target);
        }
        
        if(arr[mid] < target)
        {
            return binarysearch(arr,mid+1,right, target);
        }
        return -1;
        
    }
    public int search(int[] nums, int target) {
        
        return binarysearch(nums,0,nums.length,target);
        
    }
}