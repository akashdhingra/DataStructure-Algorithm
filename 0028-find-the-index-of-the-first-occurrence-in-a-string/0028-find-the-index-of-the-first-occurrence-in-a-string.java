class Solution {
    public int strStr(String haystack, String needle) {
        boolean exist = false;
        if(haystack.contains(needle)){
            exist = true;
        }
        
        int n = -1;
        
        if(exist){
            for(int i=0;i<haystack.length()-needle.length()+1;i++){
                if(haystack.substring(i,i+needle.length()).equals(needle)){
                    n = i;
                    break;
                }
            }
        }
        return n;
        
    }
}