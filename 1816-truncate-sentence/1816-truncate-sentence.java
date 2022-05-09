class Solution {
    public String truncateSentence(String s, int k) {
        String str ="";
        String ar[] = s.split("\\s+");
        for(int i=0;i<k;i++)
        {
            str = str+ ar[i] + " ";
        }
        return str.trim();
    }
}