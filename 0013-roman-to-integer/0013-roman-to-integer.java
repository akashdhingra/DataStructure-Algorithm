// Below is the solution using switch statement
import java.util.Map.Entry;
class Solution {
    public int romanToInt(String s) {
        int num = 0;
        int sum = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            
            
            if (4 * num < sum) {
                sum -= num;
            }
            else 
                sum += num;
             }
           
        return sum;
        
        
    }
}

// Below is the Solution using hashmap

// import java.util.Map.Entry;
// class Solution {
//     public int romanToInt(String s) {
//         HashMap<String, Integer> hs = new HashMap<String, Integer>();
//         hs.put("I",1);
//         hs.put("V",5);
//         hs.put("X",10);
//         hs.put("L",50);
//         hs.put("C",100);
//         hs.put("D",500);
//         hs.put("M",1000);
//         int sum = 0;
//         int size_str = s.length();
//         if(size_str == 0)
//             return sum;
        
//         while(size_str>0)
//         {
//             String str = String.valueOf(s.charAt(size_str-1));
            
//             for(Entry<String, Integer> entry : hs.entrySet())
//             {
//                 if(entry.getKey().equals(str)){
//                     if (4 * entry.getValue() < sum) 
//                     {
//                         sum -= entry.getValue();
//                     }
//                     else 
//                         sum += entry.getValue();
//                 }
//             }
//             size_str--;
//         }
//         return sum;
        
        
//     }
// }