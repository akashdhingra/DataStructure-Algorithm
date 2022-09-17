class Solution {
    public int search(int[] arr, int target) {
        //Applied binary search
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid] == target)
                return mid;
            // check if the low is less than mid, if yes
            // it means that array is sorted from low to mid.
            // then see if target is greater than or equal to low
            // and target is lower than mid which means that target
            // is in left half.
            if(arr[low] <= arr[mid])
            {
                if(target >= arr[low] && target < arr[mid])
                    high = mid-1;
                else
                    low = mid+1;
            }
            //if not then check if target is greater than mid and less than last                 // element then it means element is in right half.
            else
            {
                if(target >arr[mid] && target <= arr[high])
                    low = mid+1;
                else
                    high = mid-1;
            }
        }
        return -1;
        
    }
}