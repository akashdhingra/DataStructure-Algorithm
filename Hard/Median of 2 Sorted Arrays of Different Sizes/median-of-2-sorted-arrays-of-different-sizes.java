//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}
// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
        int[] arr = new int[n + m];
        int j = 0;
        int i=0;
        int pos = 0;
        while(i<n && j<m){
            if(a[i] < b[j]){
                arr[pos] = a[i];
                i++;
            }
            else{
                arr[pos] = b[j];
                j++;
            }
            pos++;
        }
        
        while(i < n){
            arr[pos] = a[i];
            i++;
            pos++;
        }
        
        while(j<m){
            arr[pos] = b[j];
            j++;
            pos++;
        }
        
        int len = arr.length;
        
        if(len%2 == 1){
            return arr[len/2];
        }
        
        return (arr[len/2] + arr[(len/2) - 1])/2.0 ;
    }
}