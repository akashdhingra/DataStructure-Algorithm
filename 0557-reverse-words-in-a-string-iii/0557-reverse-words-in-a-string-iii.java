class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        String reverse = "";
        for(int i=0;i<str.length;i++){
            if(i==str.length-1){
                reverse = reverse + reverseString(str[i]);
            }
            else{
                reverse = reverse + reverseString(str[i]) + " ";
            }
        }
        
        return reverse;
         
    }
    
    public String reverseString(String s){
        String str = "";
        for(int i=s.length()-1; i>=0; i--){
            str = str + s.charAt(i);
        }
        return str;
    }
}