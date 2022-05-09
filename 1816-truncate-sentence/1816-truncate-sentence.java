class Solution {
    public String truncateSentence(String s, int k) {
        String[] ar = s.split(" ");
        StringBuilder str = new StringBuilder();
        
        for(int i=0;i<k;i++) {
            str.append(ar[i] + " ");
        }
        return str.toString().trim();
    }
}