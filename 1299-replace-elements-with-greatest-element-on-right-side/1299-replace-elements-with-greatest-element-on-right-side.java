class Solution {
    public int[] replaceElements(int[] arr) {
        int new_array[] = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int max = 0;
            for(int j=i+1;j<arr.length;j++)
            {
                if (arr[j] > max)
                    max = arr[j];
            }
            if(i== (arr.length - 1))
                new_array[i] = -1;
            else
                new_array[i] = max;
            
        }
        return new_array;
    }
}