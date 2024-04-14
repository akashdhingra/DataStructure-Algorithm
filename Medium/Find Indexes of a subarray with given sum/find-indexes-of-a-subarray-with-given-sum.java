//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        int current_sum = arr[0];
        int start = 0;
        int i;
        int end_index = 0;
        
        for(i=1;i<=n;i++){
            
            while(current_sum > s && start < i-1){
                current_sum = current_sum - arr[start];
                start++;
            }
            
            if(current_sum == s){
                end_index = i;
                break;
            }
            
            if(i < n){
                current_sum = current_sum + arr[i];
            }
        }
        if(end_index == 0){
            result.add(-1);
        }
        else{
            result.add(start+1);
            result.add(end_index);
        }
        
        return result;
    }
}