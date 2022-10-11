class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3 || nums == null)
            return false;
        
        int n1 = Integer.MAX_VALUE;
        int n2 = Integer.MAX_VALUE;
        
        for(int x : nums)
        {
            if(x < n1){
                n1 = x;
            }
            
            if(x > n1)
            {
                n2 = Math.min(n2,x);
            }
            
            if(x > n2)
                return true;
        }
        return false;   
    }
    
}