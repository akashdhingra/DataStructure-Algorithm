//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
        mergeSort(a,0,a.length-1);
        // code here 
    }
    
    static void mergeSort(int a[], int l, int r){
        if(l<r){
            int mid = l + (r-l)/2;
            
            mergeSort(a,l,mid);
            mergeSort(a,mid+1,r);
            merge(a,l,mid,r);
            
        }
        
    }
    
    static void merge(int a[], int l, int m, int r){
        
        int n1 = m-l+1;
        int n2 = r-m;
        
        int left[] = new int[n1];
        int right[] = new int[n2];
        
        for(int i=0;i<n1;i++){
            left[i] = a[l+i];
        }
        
        for(int j=0;j<n2;j++){
            right[j] = a[m+1+j];
        }
        
        int i=0, j=0;
        int k = l;
        
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                a[k] = left[i];
                i++;
            }
            else{
                a[k] = right[j];
                j++;
            }
            k++;
        }
        
        while(i<n1){
            a[k] = left[i];
            i++;
            k++;
        }
        
        while(j<n2){
            a[k] = right[j];
            j++;
            k++;
        }
    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends