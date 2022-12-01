class Solution {
    public boolean halvesAreAlike(String s) {
        int count = 0;
        String s1 = s.toLowerCase().substring(0,s.length()/2);
        String s2 = s.toLowerCase().substring(s.length()/2,s.length());
        
        for(int i=0;i<s.length()/2;i++){
            if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i'||
              s1.charAt(i) == 'o' || s1.charAt(i) == 'u')
                count++;
            
            if(s2.charAt(i) == 'a' || s2.charAt(i) == 'e' || s2.charAt(i) == 'i'||
              s2.charAt(i) == 'o' || s2.charAt(i) == 'u')
                count--;
        }
        
        if(count == 0)
            return true;
        return false;
    }
}

// Solution 1
// class Solution {
//     public boolean halvesAreAlike(String s) {
//         int count1 = 0;
//         int count2 = 0;
//         String s1 = s.toLowerCase().substring(0,s.length()/2);
//         String s2 = s.toLowerCase().substring(s.length()/2,s.length());
        
//         for(int i=0;i<s.length()/2;i++){
//             if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i'||
//               s1.charAt(i) == 'o' || s1.charAt(i) == 'u')
//                 count1++;
            
//             if(s2.charAt(i) == 'a' || s2.charAt(i) == 'e' || s2.charAt(i) == 'i'||
//               s2.charAt(i) == 'o' || s2.charAt(i) == 'u')
//                 count2++;
//         }
        
//         if(count1==count2)
//             return true;
//         return false;
//     }
// }