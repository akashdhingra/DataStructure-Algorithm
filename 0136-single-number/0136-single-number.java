class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hs = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i], 0)+1);
        }
        
        for(int i : nums){
            if(hs.get(i) == 1)
                return i;
        }
        
        return 0;
    }
}