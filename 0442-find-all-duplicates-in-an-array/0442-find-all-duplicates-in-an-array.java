class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> hs = new HashMap<>();
        List<Integer> ls = new ArrayList<>();
        
        for(int i : nums){
            if(hs.containsKey(i)){
                hs.put(i,hs.get(i)+1);
            }
            else{
                hs.put(i,1);
            }
        }
        
        for(Integer i : hs.keySet()){
            if(hs.get(i) == 2){
                ls.add(i);
            }
        }
        return ls;
    }
}