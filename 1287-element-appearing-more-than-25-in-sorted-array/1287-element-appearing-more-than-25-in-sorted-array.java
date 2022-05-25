class Solution {
    public int findSpecialInteger(int[] arr) {
        int c = arr.length/4;
        int count = 0;
        int num = 0;
        if(arr.length == 1)
            return arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(count>c)
                return num;
            if(arr[i] == num)
                count++;
            else
            {
                count = 1;
                num = arr[i];
            }
                
        }
        return num;
        
        
    }
}