class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        boolean check = true;    
        for(int i=left;i<=right;i++)
        {
            int a = i;
            while(a>0)
            {
                int last_digit = a%10;
                if(last_digit> 0 && i % last_digit == 0)
                {
                    check = true;
                    a = a/10;
                }
                else
                {
                    check = false;
                    break;
                }
                
            }
            
            if(check == true)
            {
                arrlist.add(i);
            }
        }
        return arrlist;
    }
}