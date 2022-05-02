class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int n= words.length;
        String str = "";
        for(int i=0;i<n;i++)
        {
            str = str.concat(words[i]);
            if(str.equals(s))
            {
                return true;
            }
        }
        return false;
        
    }
}