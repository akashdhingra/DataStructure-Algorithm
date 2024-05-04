//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    public static void main (String[] args)
    {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0;i<t;i++){
		    String s = in.next();
		    if (new Sol().isPossible (s) == 1)
		        System.out.println ("Yes");
		    else
		        System.out.println ("No");
		}
	}
}

// Contributed By: Pranay Bansal


// } Driver Code Ends


class Sol
{
    int isPossible (String S)
    {
        // your code here
        Map<Character,Integer> hs = new HashMap<>();
        for(int i=0;i<S.length();i++){
            hs.put(S.charAt(i), hs.getOrDefault(S.charAt(i) , 0) + 1);
        }
        int oddCount = 0; // Keep track of the count of characters with odd frequency
        for (int val : hs.values()) {
            if (val % 2 != 0) {
                oddCount++;
                if (oddCount > 1) {
                    return 0; // More than one character has odd frequency, so not possible to form palindrome
                }
            }
        }
        return 1;
    }
}