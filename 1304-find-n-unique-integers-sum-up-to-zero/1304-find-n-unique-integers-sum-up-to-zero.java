class Solution {
    public int[] sumZero(int n) {
        int ar[] = new int[n];
        if(n==1)
            ar[0] = 0;
        else if (n%2 != 0)
        {
            int j=0;
            for(int i=-(n/2);i<=n/2;i++)
            {
                ar[j] = i;
                j++;
            }
        }
        else
        {
            int j=0;
            for(int i=-(n/2);i<=n/2;i++)
            {
                if(i==0)
                    continue;
                else
                {
                    ar[j] = i;
                    j++;
                }
                
            }
        }
            
        return ar;
        
    }
}