class Solution {
    public boolean isSameAfterReversals(int num) {
        int reversed1 = 0;
        int reversed2 = 0;
        int old_num = num;
        while(num!=0)
        {
            reversed1 = (reversed1 * 10) + (num%10);
            num = num/10;
        }
        int old_reversed1 = reversed1; 
        while(reversed1!=0)
        {
            reversed2 = (reversed2 * 10) + (reversed1%10);
            reversed1 = reversed1/10;
        }
        return (old_num == reversed2);
        
    }
}