class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i:nums)
        {
            if(hmap.containsKey(i))
            {
                hmap.put(i,hmap.get(i)+1);
            }
            else
            {
                hmap.put(i,0);
            }
        }
        
        int sum = 0;
        for(Map.Entry<Integer,Integer> entry : hmap.entrySet())
        {
            if(entry.getValue() == 0)
            {
                sum += entry.getKey();
            }
        }
        
        return sum;
        
    }
}