//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    int res = ob.findNext(n);
                    if(res==-1)
                        System.out.println("not possible");
                    else
                        System.out.println(res);
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int findNext (int n){
    	char[] values = String.valueOf(n).toCharArray();
    	int pivot = -1;
    	for(int i=values.length-1;i>0;i--){
    		if(values[i] > values[i-1]){
    			pivot = i;
    			break;
    		    
    		}
    	}
    
    	if(pivot == -1){
    		return -1;
    	}
    
    	int secondMax = -1;
    	int x = values[pivot-1];
    	int min = pivot;
    	for(int j=values.length-1;j>pivot;j--){
    		if(values[j]>x && values[j]<values[min]){
    			min = j;
    		}
    	}
    
    	char temp = values[min];
    	values[min] = values[pivot-1];
    	values[pivot-1] = temp;
    
    	Arrays.sort(values,pivot,values.length);
    
    	int result = Integer.parseInt(new String(values));
    	return result;
    }


}