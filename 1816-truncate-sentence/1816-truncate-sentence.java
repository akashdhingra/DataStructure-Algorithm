class Solution {
    public String truncateSentence(String s, int k) {
        String str ="";
        String ar[] = s.split("\\s+");
        for(int i=0;i<k;i++)
        {
            if(i==k-1)
            {
                str = str + ar[i];
            }
            else
                str = str + ar[i] + " ";
            
        }
        return str;
    }
}