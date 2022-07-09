// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		


		//taking testcases
		int T=sc.nextInt();
		
		while(T-->0)
		{
		    Solution obj=new Solution();
		    int N;
		    N=sc.nextInt();//taking N
		    //calling function exactly3Divisors()
		    System.out.println(obj.exactly3Divisors(N));
		   
		    
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    public boolean isPrime(int n)
    {
        if(n<=1)
        return false;
        else if(n==2 || n==3)
        return true;
        else if(n%2 ==0 || n%3 == 0)
        return false;
        else
        {
            for(int i=5 ; i*i <= n; i = i+6)
            {
                if(n% i ==0 || (n% (i+2) ==0))
                return false;
            }
        }
        return true;
    }
    
    public int exactly3Divisors(int N)
    {
        //Your code here
        int count = 0;
        for(int j=2;j*j<=N;j++)
        {
            if(isPrime(j) && (j*j <= N))
             count++;
        }
        return count;
    }
}
