// Solution 2

class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int i = 0;
        int j = str.length()-1;
        while(j>=i){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            
            i++;
            j--;
        }
        return true;
        
    }
    
}




// Solution 1 
// Converting entered string to normal string by removing non-aplha numeric characters
// then reversing the list and comparing

// class Solution {
//     public boolean isPalindrome(String s) {
        
//         String user_string = "";
//         String reverse_string = "";
        
//         for(int i=0;i<s.length();i++)
//         {
//             if(s.charAt(i)>='a' && s.charAt(i) <='z' || s.charAt(i)>='A' && s.charAt(i) <='Z'  || s.charAt(i)>= '0' && s.charAt(i) <='9')
//             {
//                 user_string = user_string + Character.toLowerCase(s.charAt(i));
//             }
            
//         }
        
//         for(int j=user_string.length()-1;j>=0;j--){
//             reverse_string = reverse_string + user_string.charAt(j);
//         }
        
//         if(user_string.equals(reverse_string))
//             return true;
//         return false;
//     }
    
// }