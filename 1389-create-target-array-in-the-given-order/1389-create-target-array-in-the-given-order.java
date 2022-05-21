class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> ls = new ArrayList<>();
        for(int i=0;i<index.length;i++)
        {
            ls.add(index[i],nums[i]);
        }
        int ar[] = new int[index.length];
        for(int i=0;i<index.length;i++)
        {
            ar[i] = ls.get(i);
        }
        return ar;
    }
}