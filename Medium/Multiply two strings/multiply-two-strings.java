//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.math.*;

class Multiply{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            Solution g=new Solution();
            System.out.println(g.multiplyStrings(a,b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public String multiplyStrings(String s1, String s2) {
    // Check if either s1 or s2 is negative
    boolean isNegative = (s1.charAt(0) == '-' && s2.charAt(0) != '-') || (s1.charAt(0) != '-' && s2.charAt(0) == '-');

    // Remove negative signs from s1 and s2 if present
    if (s1.charAt(0) == '-') {
        s1 = s1.substring(1);
    }
    if (s2.charAt(0) == '-') {
        s2 = s2.substring(1);
    }

    int m = s1.length();
    int n = s2.length();
    int[] result = new int[m + n]; // Initialize an array to store the result

    // Iterate through each character of s1 and s2 from right to left
    for (int i = m - 1; i >= 0; i--) {
        for (int j = n - 1; j >= 0; j--) {
            int mul = (s1.charAt(i) - '0') * (s2.charAt(j) - '0'); // Calculate the product of digits
            int sum = mul + result[i + j + 1]; // Add the product to the current position in result array
            result[i + j] += sum / 10; // Update the carry
            result[i + j + 1] = sum % 10; // Update the current digit
        }
    }

    // Convert the result array to a string
    StringBuilder sb = new StringBuilder();
    for (int digit : result) {
        // Skip leading zeros
        if (!(sb.length() == 0 && digit == 0)) {
            sb.append(digit);
        }
    }

    // If the result is empty, it means the multiplication resulted in 0
    String multipliedResult = sb.length() == 0 ? "0" : sb.toString();

    // Add negative sign if necessary
    return (isNegative & sb.length() != 0) ? "-" + multipliedResult : multipliedResult;
}

    
}