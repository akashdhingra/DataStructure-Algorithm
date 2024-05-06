//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            int A[] = new int[n];
            String s[]=in.readLine().trim().split(" ");
            for (int i = 0;i < n;i++)
            {
                A[i] = Integer.parseInt(s[i]);
            }
            int key = Integer.parseInt(in.readLine().trim());
            
            out.println(new Solution().search(A, 0, n - 1, key));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int search(int A[], int l, int h, int key)
    {
        if(l>h){
            return -1;
        }
        
        int mid = l + (h-l)/2;
        
        if(A[mid] == key){
            return mid;
        }
        
        if(A[l] <= A[mid]){
            if(key <= A[mid] && key >= A[l]){
                return search(A,l,mid-1,key);
            }
            
            return search(A,mid+1,h,key);
        }
        
        if(key >= A[mid] && key <= A[h] ){
            return search(A,mid+1,h,key);
        }
        return search(A,l,mid-1,key);
    }
}