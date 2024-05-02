//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            System.out.println(obj.kthDiff(a, n, k));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long kthDiff(int arr[], int n, int k)
    {
        Arrays.sort(arr);
        int low = 0;
        int high = arr[n-1] - arr[0];
        
        while(low<high){
            int mid = low + (high-low)/2;
            int count = countPairs(arr,n, mid);
            
            if(count < k){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
    
    private int countPairs(int arr[], int n, int mid){
        int count = 0;
        int j=0;
        for(int i=0;i<n;i++){
            while(j<n && arr[j] - arr[i] <= mid){
                j++;
            }
            count += j-i-1;
        }
        return count;
        
    }
}