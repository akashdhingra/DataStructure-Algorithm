class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Solved using hashset
        // first convert the nums1 value into hashset h1
        // now add values of nums2 which are present in nums1
        // into hashset h2 and convert the hashset into array
        // and return the array.
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            h1.add(nums1[i]);
        }
        
        for(int i=0;i<nums2.length;i++)
        {
            if(h1.contains(nums2[i]))
                h2.add(nums2[i]);
        }
        
        int arr[] = new int[h2.size()];
        int j=0;
        for(int i:h2)
        {
            arr[j++] = i;
        }
        return arr;
    }
    
}