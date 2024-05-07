//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        HashMap<Character, Integer> hs = new HashMap();
        int left = 0;
        int maxLength = -1;
        for(int right=0;right<s.length();right++){
            char rightChar = s.charAt(right);
            hs.put(rightChar, hs.getOrDefault(rightChar, 0) + 1);
            
            while(hs.size() > k){
                char leftChar = s.charAt(left);
                hs.put(leftChar, hs.get(leftChar)-1);
                if(hs.get(leftChar) == 0){
                    hs.remove(leftChar);
                }
                left++;
            }
            
            if(hs.size() == k){
                maxLength = Math.max(maxLength,right-left + 1);
            }
        }
        return maxLength;
    }
}