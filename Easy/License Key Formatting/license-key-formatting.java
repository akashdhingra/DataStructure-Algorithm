//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            int k = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.ReFormatString(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static String ReFormatString(String S, int K){
        // code here
        S = S.toUpperCase().replaceAll("-","");
        StringBuilder result = new StringBuilder();
        
        int firstGroupLength = S.length() % K;
        if(firstGroupLength>0){
            result.append(S.substring(0,firstGroupLength));
            
            if(firstGroupLength < S.length()){
                result.append("-");
            }
            
        }
        
        for(int i=firstGroupLength;i<S.length();i+=K){
            result.append(S.substring(i,Math.min(i+K,S.length())));
            
            if(i+K < S.length()){
                result.append("-");
            }
        }
        
        return result.toString();
       
    }
}