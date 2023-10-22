class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m+n-1;
        int p1 = m-1;
        int p2 = n-1;
        while(p1>=0 && p2>=0){
            if(nums1[p1] > nums2[p2]){
                nums1[p] = nums1[p1];
                p1--;
            }
            else{
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
        
        while(p2>=0){
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}

// Logic
// The approach used to merge two sorted arrays `nums1` and `nums2` in non-decreasing order while storing the result in `nums1` is a common technique called the "Two-Pointer Merge" or "Merge Sort Merge." Here's an explanation of the approach:

// 1. Initialize Pointers:
//    - We start by initializing three pointers:
//      - `p1`: Initially points to the last valid element in `nums1` (index `m - 1`).
//      - `p2`: Initially points to the last element in `nums2` (index `n - 1`).
//      - `p`: Initially points to the last position in the merged array (index `m + n - 1`).

// 2. Merge from Right to Left:
//    - We iterate from right to left in both `nums1` and `nums2`, comparing elements and placing the larger element in the merged array at index `p`.

// 3. Comparison and Assignment:
//    - At each step, we compare `nums1[p1]` and `nums2[p2]`. If `nums1[p1]` is greater, we assign it to `nums1[p]`, and `p1` moves one position to the left.
//    - If `nums2[p2]` is greater, we assign it to `nums1[p]`, and `p2` moves one position to the left.

// 4. Continue Merging:
//    - We continue this process until one of the two arrays (either `nums1` or `nums2`) has been completely merged.

// 5. Handling Remaining Elements:
//    - After the above loop, there might be remaining elements in either `nums1` or `nums2`. If `p2` is greater than or equal to 0, we copy the remaining elements from `nums2` into `nums1`.

// 6. Result:
//    - The result is a merged and sorted array in `nums1`. The unused zeros at the end can be ignored because they are just placeholders.

// The time complexity of this approach is O(m + n), where `m` is the length of `nums1` and `n` is the length of `nums2`. This is an efficient way to merge two sorted arrays without using additional space, as the merging is done in-place within `nums1`.