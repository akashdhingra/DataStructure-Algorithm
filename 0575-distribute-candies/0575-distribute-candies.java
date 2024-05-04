class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : candyType){
            hs.add(i);
        }
        
        int max_candy = candyType.length/2;
        
        if(max_candy > hs.size()){
            return hs.size();
        }
        return max_candy;
    }
}