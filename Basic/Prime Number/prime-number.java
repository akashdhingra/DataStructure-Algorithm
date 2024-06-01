//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isPrime(N));
        }
    }
}
// } Driver Code Ends


class Solution{
    static int isPrime(int N){
        // code here
        if (N <= 1) {
            return 0;
        }
        
        // Step 2: Check if N is 2 or 3
        if (N == 2 || N == 3) {
            return 1;
        }
        
        // Step 3: Check for divisibility by 2 or 3
        if (N % 2 == 0 || N % 3 == 0) {
            return 0;
        }
        
        // Step 4: Check for factors from 5 to sqrt(N)
        for (int i = 5; i * i <= N; i += 6) {
            if (N % i == 0 || N % (i + 2) == 0) {
                return 0;
            }
        }
        
        return 1;

    }
}