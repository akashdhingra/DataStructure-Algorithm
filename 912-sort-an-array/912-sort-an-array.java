class Solution {
    // The below solution is of merge sort
    // Quick sort will not work as for the worst case
    // quick sort has O(n^2) complexity
    // where merge sort has O(nlogn) at worstCase
    public void merge(int []arr, int low, int mid, int high)
    {
        int n1 = mid-low+1;
        int n2 = high-mid;
        
        int []left = new int[n1];
        int []right = new int[n2];
        
        for(int i=0;i<n1;i++)
        {
            left[i] = arr[low+i];
        }
        
        for(int j=0;j<n2;j++)
        {
            right[j] = arr[mid+j+1];
        }
        
        int i=0, j=0;
        
        int k=low;
        while(i< n1 && j<n2)
        {
            if(left[i] <= right[j])
            {
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
            
        }
        
        while(i<n1)
        {
            arr[k] = left[i];
            i++;
            k++;
        }
        
        while(j<n2)
        {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    
    public void MergeSort(int []arr, int low, int high)
    {
        if(low<high)
        {
            int mid = low + ((high-low)/2);
            MergeSort(arr,low,mid);
            MergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }

        
    }
    public int[] sortArray(int[] nums) {
        MergeSort(nums,0,nums.length-1);
        return nums;
        
    }
}