class Solution {
    public int findSpecialInteger(int[] arr) {
        int c = arr.length/4;
        for(int i=0;i<arr.length-c;i++)
        {
            if(arr[i] == arr[c+i])
                return arr[i];
        }
        return -1;
    }
}