class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        int size = strs[0].length();

        for(int i=0;i<size;i++)
        {
            for(int j=0;j+1<strs.length;j++)
            {
                if(strs[j].charAt(i) > strs[j+1].charAt(i))
                {
                    count++;
                    break;
                }
            }
        }

        
        return count;
    }
}