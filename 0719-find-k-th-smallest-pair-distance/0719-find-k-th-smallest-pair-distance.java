class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums[nums.length-1] - nums[0];
        while(low<high){
            int mid = low + (high-low)/2;
            int count = countPairs(nums,nums.length,mid);
            if(count < k){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
    
    private int countPairs(int[] nums,int n, int mid){
        int count = 0;
        int j = 0;
        for(int i=0;i<n;i++){
            while(j<n && nums[j] - nums[i] <= mid){
                j++;
            }
            count += j-i-1;
        }
        return count;
    }
}