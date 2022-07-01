class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> arraylist = new ArrayList<Integer>();   
        for(int i=left;i<=right;i++)
        {
            int num = i;
            while(num>0){
                int last_digit = num%10;
                if(last_digit == 0 || i % last_digit != 0){
                    break;
                }
                else
                    num = num/10;
            }
            if(num == 0)
                arraylist.add(i);
        }
        return arraylist;
    }
}