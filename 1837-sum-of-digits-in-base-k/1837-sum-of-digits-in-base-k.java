class Solution {
    public int sumBase(int n, int k) {
        int sum = 0;
        int digit = 0;
        while(n>0)
        {
            digit = n%k;  // returns the unit digit
            sum = sum + digit;
            n = n/k;
        }
        return sum;
        
    }
}