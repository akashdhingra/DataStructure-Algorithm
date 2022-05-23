class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        String str = "";
        for(int i=1;i<=s.length();i++)
        {
            str = s.substring(0,i);
            for(int j=0;j<words.length;j++)
            {
                if(words[j].equals(str))
                    count++;
            }
        }
        return count;
        
    }
}