class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ls = new ArrayList<Integer>();
        //Set the values as negative
        
        for(int i : nums){
            int index = Math.abs(i) - 1;
            if(nums[index] > 0){
                nums[index] = -nums[index];
            }
        }
        
        // Add indexes whoes values is greater than 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                ls.add(i+1);
            }
        }
        
        return ls;
        
    }
}