class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int no_of_even_numbers = 0;
        for(int i=0;i<n;i++)
        {
            int count = 0;
            while(nums[i] != 0)
            {
                nums[i] = nums[i]/10;
                count++;
            }
            if(count % 2 ==0)
                no_of_even_numbers++;
        }
        return no_of_even_numbers;
    }
}