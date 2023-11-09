//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        if(str==null){
            return null;
        }
        // Reverse the string str
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        
        while(left < right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            
            left++;
            right--;
        }
        
        return new String(charArray);
    }
    
    // Due to concationation of string, it will take O(n^2)
    // public static String reverseWord(String str)
    // {
    //     // Reverse the string str
    //     String s = "";
    //     for(int i=str.length()-1;i>=0;i--){
    //         s = s + str.charAt(i);
    //     }
    //     return s;
    // }
}