//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
        // code here
        Set<Character> commonA = new HashSet<>();
        Set<Character> commonB = new HashSet<>();
        
        for(int i=0;i<A.length();i++){
            commonA.add(A.charAt(i));
        }
        
        for(int i=0;i<B.length();i++){
            commonB.add(B.charAt(i));
        }
        
        String result ="";
        
        for(char c = 'a'; c<='z';c++){
            if((commonA.contains(c) && !commonB.contains(c)) || (!commonA.contains(c) && commonB.contains(c))){
                result += c;
            }
        }
        
        return result == "" ? "-1" : result;
    }
}