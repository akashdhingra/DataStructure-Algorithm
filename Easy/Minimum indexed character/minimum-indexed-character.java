//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            String patt = br.readLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.printMinIndexChar(str, patt));
        }
    }
}
// } Driver Code Ends


class Solution{
    
    // Function to find the character in patt which is present in str at min index
    public static String printMinIndexChar(String S, String patt){
        
        Map<Character,Integer> hs = new HashMap<>();
        
        for(int i=0;i<S.length();i++){
            if(!hs.containsKey(S.charAt(i))){
                hs.put(S.charAt(i),i);
            }
        }
        
        int pos = Integer.MAX_VALUE;
        char s = '$';
        for(int j=0;j<patt.length();j++){
            if(hs.containsKey(patt.charAt(j))){
                int val = hs.get(patt.charAt(j));
                if(val < pos){
                    pos = val;
                    s = patt.charAt(j);
                }
            }
        }
        
        return s == '$' ? "$" : String.valueOf(s);
        
    
    }
    
}
