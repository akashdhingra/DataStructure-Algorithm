//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 


class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt(); 
            int arr[] = new int[n];
            for (int i = 0; i < n; ++i)
            {
                arr[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            int []ans= obj.sortArr(arr, n);
            for(int i=0;i<n;i++)
            {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int[] sortArr(int[] arr, int n) 
    { 
        // code here
        sort(arr, 0, arr.length-1);
        return arr;
        
    }
    
    void sort(int[] arr, int l, int r){
        
        if(l<r){
            int mid = l + (r-l)/2;
            
            sort(arr, l, mid);
            sort(arr, mid+1, r);
            merge(arr,l, mid, r);
        }
        
    }
    
    void merge(int arr[], int l, int m, int r){
        
        int n1 = m-l+1;
        int n2 = r-m;
        
        int left[] = new int[n1];
        int right[] = new int[n2];
        
        
        for(int i=0;i<n1;i++){
            left[i] = arr[l+i];
        }
        
        for(int i=0;i<n2;i++){
            right[i] = arr[m+i+1];
        }
        
        int i=0;
        int j=0;
        int k=l;
        
        while(i<n1 && j<n2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            
            k++;
            
        }
        
        while(i<n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        
        while(j<n2){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
} 