class Solution {
    public String longestCommonPrefix(String[] strs) {
        int count = 0;
        
        Arrays.sort(strs);
        String first_str = strs[0];
        String last_str = strs[strs.length - 1];
        for(int i=0;i<first_str.length();i++){
            if(first_str.charAt(i) == last_str.charAt(i))
                count++;
            else
                break;
        }
        
        return count == 0 ? "" :  first_str.substring(0,count);
        
    }
}