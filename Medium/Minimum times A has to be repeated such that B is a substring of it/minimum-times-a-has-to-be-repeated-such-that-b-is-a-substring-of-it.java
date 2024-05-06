//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String A = read.readLine();
            String B = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.minRepeats(A,B));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int minRepeats(String A, String B) {
        // code here
        String test = A;
        int moves = 1;
        while(test.length() < B.length()){
            test += A;
            moves++;
        }
        
        if(test.contains(B)){
            return moves;
        }
        
        test+=A;
        moves++;
        if(test.contains(B)){
            return moves;
        }
        else{
            return -1;
        }
        
    }
}