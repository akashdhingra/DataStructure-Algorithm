class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int current = 0;
        int start = 0;
        
        for(int i=1;i<=n;i++)
        {
            if(i%7 == 1)
            {
                start++;
                total+= start;
                current = start;
            }
            else{
                current++;
                total+=current;
            }
        }
        return total;
    }
}