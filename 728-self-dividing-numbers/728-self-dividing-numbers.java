class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();   
        for(int i=left;i<=right;i++)
        {
            int a = i;
            while(a>0){
                int last_digit = a%10;
                if(last_digit == 0 || i % last_digit != 0){
                    break;
                }
                else
                    a = a/10;
            }
            if(a == 0)
                arrlist.add(i);
        }
        return arrlist;
    }
}