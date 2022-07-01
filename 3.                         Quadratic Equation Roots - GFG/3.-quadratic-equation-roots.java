// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.quadraticRoots(a, b, c);
            if (ans.size() == 1 && ans.get(0) == -1)
                System.out.print("Imaginary");
            else
                for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        double d = Math.pow(b,2) - (4*a*c);
        if(d<0)
        {
            arrlist.add(-1);
        }
        else
        {
            double x1 = ((-1* b) + (Math.sqrt(d)))/(2*a);
            double x2 = ((-1* b) - (Math.sqrt(d)))/(2*a);
            arrlist.add((int)Math.floor(Math.max(x1,x2)));
            arrlist.add((int)Math.floor(Math.min(x1,x2)));
        }
        
        return arrlist;
    }
}