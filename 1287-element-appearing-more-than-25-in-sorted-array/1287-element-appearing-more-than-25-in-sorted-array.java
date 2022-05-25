class Solution {
    public int findSpecialInteger(int[] arr) {
        int c = arr.length/4;
        int number = 0;
        for(int i=0;i<arr.length-c;i++)
        {
            if(arr[i] == arr[c+i])
                number = arr[i];
        }
        return number;
    }
}