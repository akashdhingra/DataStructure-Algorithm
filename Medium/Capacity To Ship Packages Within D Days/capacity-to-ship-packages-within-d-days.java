//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] arr = new int[N];
            
            int D = Integer.parseInt(read.readLine());
            
            for(int i=0; i<N; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.leastWeightCapacity(arr,N,D));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int leastWeightCapacity(int[] arr, int N, int D) {
        // code here
        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();
        while(low <= high){
            int mid = low + (high-low)/2;
            int numberOfDays = noOfDays(arr, mid);
            if(numberOfDays <= D){
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
    
    
    static int noOfDays(int arr[], int cap){
        int days = 1;
        int load = 0;
        for(int i=0;i<arr.length;i++){
            if(load + arr[i] > cap){
                days+=1;
                load = arr[i];
            }
            else{
                load += arr[i];
            }
        }
        return days;
    }
}