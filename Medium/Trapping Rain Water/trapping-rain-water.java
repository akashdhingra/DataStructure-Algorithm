//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        long water = 0;
        int leftArr[] = new int[n];
        int rightArr[] = new int[n];
        leftArr[0] = arr[0];
        for(int i=1;i<n;i++){
            leftArr[i] = Math.max(leftArr[i-1], arr[i]);
        }
        
        rightArr[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightArr[i] = Math.max(rightArr[i+1], arr[i]);
        }
        for(int i=0;i<n;i++){
            water = water +Math.max(0,(Math.min(leftArr[i], rightArr[i]) - arr[i]));
        }
        return water;
    } 
}


