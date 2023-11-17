//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        // Your code here
        if(k > 0 && k <= r-l+1){
            int partitionIndex = partition(arr, l, r);
            
            if(partitionIndex-l == k-1){
                return arr[partitionIndex];
            }
            
            if(partitionIndex-l > k-1){
                return kthSmallest(arr, l, partitionIndex-1,k);
                
            }
            else{
                return kthSmallest(arr,partitionIndex+1,r,k-partitionIndex + l - 1);
            }
        }
        
        return Integer.MAX_VALUE;
       
    } 
    
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        
        int i = low;
        
        for(int j=low;j<=high-1;j++){
            if(arr[j] <= pivot){
                swap(arr, i, j);
                i++;
            }
        }
        
        swap(arr, i, high);
        
        return i;
    }
    
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}

// Below solution is done through sort but it will take unnecessary time to sort the elements.

// class Solution{
//     public static int kthSmallest(int[] arr, int l, int r, int k) 
//     { 
//         //Your code here
//         sort(arr, l , r);
//         return arr[k-1];
//     } 
    
//     static void sort(int arr[], int l, int r){
//         if(l < r){
//             int mid = l + (r-l)/2;
//             sort(arr, l, mid);
//             sort(arr, mid+1, r);
//             merge(arr, l, mid, r);
//         }
//     }
    
//     static void merge(int[] arr, int l, int mid, int r){
//         int n1 = mid - l + 1;
//         int n2 = r-mid;
        
//         int left[] = new int[n1];
//         int right[] = new int[n2];
        
//         for(int i=0;i<n1;i++){
//             left[i] = arr[l+i];
//         }
        
//         for(int j=0;j<n2;j++){
//             right[j] = arr[mid+1+j];
//         }
        
//         int i=0;
//         int j=0;
//         int k=l;
        
//         while(i<n1 && j<n2){
//             if(left[i] <= right[j]){
//                 arr[k] = left[i];
//                 i++;
//             }
//             else{
//                 arr[k] = right[j];
//                 j++;
//             }
            
//             k++;
//         }
        
//         while(i<n1){
//             arr[k] = left[i];
//             k++;
//             i++;
//         }
        
//         while(j<n2){
//             arr[k] = right[j];
//             k++;
//             j++;
//         }
//     }
// }

