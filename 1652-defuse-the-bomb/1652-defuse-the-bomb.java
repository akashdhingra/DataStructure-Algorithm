class Solution {
    public int[] decrypt(int[] code, int k) {
        int ar[] = new int[code.length];
        int sum = 0;
        int n = code.length;
        if(k==0)
            return ar;
        for(int i=0;i<n;i++)
        {
            if(k>0)
            {
               for(int j=i+1;j<=i+k;j++)
                    ar[i] += code[j%n]; 
            }
            else
            {
                for(int l=i+k;l<=i-1;l++)
                    ar[i] += code[(l+n)%n];
            }
            
        }
        return ar;
        
    }
}