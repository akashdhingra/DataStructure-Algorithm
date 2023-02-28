class Solution {
    public int differenceOfSum(int[] nums) {
        int result = 0;
        int sum = 0;
        int sumDigits = 0;
        for(int n : nums){
            sum = sum + n;
            while(n > 0){
                sumDigits = sumDigits + n%10;
                n = n/10;
            }
        }
        return Math.abs(sum-sumDigits);
    }
}