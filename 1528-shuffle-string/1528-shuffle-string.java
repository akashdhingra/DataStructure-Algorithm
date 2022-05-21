class Solution {
    public String restoreString(String s, int[] indices) {
        String str = "";
        ArrayList<Character> c = new ArrayList<>();
        for(char ch : s.toCharArray())
            c.add(ch);
        for(int i=0;i<indices.length;i++)
        {
            int position = 0;
            int j = 0;
            while(indices[j] != i)
            {
                position++;
                j++;
            }
            str = str + c.get(position);
        }
        return str;
    }
}