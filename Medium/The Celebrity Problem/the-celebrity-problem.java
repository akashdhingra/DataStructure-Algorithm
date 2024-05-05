//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
        int index = -1;
    	// code here 
    	for(int i=0;i<n;i++){
    	    boolean allZeros = true;
    	    for(int j=0;j<n;j++){
    	        if(M[i][j] != 0){
    	            allZeros = false;
    	            break;
    	        }
    	    }
    	    if(allZeros){
    	       index = i; 
    	    }
    	}
    	
    	if(index != -1){
    	    for(int j=0;j<n;j++){
    	        if(index== j)
    	            continue;
    	        if(M[j][index] == 0){
    	            index = -1;
    	            break;
    	        }
    	    }
    	}
    	
    	
    	return index != -1 ? index : -1;
    }
}