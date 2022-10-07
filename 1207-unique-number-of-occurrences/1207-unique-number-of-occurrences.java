class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // getOrDefault is the method of hashmap that is used to return
        // the value of value at mentioned key getOrDefault(k,df),
        // if key is not found then df, which will be a default value set
        // by user will be returned.
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i:arr)
            hmap.put(i,hmap.getOrDefault(i,0)+1);
        
        //checks if the value of the key is equal to the size of the created key
        // if every value is unique then set will create the hashset of value equal to
        // size of hashmap
        // return will be true if hashset is equal to hashmap size.
        // otherwise false.
        HashSet<Integer> hset = new HashSet<>(hmap.values());
        return hset.size() == hmap.size();
    }
}