class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxValue = 0;
        int[] charArr = new int[128];
        Arrays.fill(charArr,-1);
        int i = 0;
        int j = 0;
        
        while(j<n){
            if(charArr[s.charAt(j)] >=i){
                i = charArr[s.charAt(j)] + 1;
            }
            
            charArr[s.charAt(j)] = j;
            maxValue = Math.max(maxValue,j-i+1);
            j++;
        }
        return maxValue;
        
    }
}
