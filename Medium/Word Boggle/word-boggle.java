//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            String[] dictionary = new String[N];
            for(int i=0;i<N;i++)
            {
                dictionary[i] = sc.next();
            }
            
            int R = Integer.parseInt(sc.next());
            int C = Integer.parseInt(sc.next());
            
            char board[][] = new char[R][C];
            for(int i=0;i<R;i++)
            {
                for(int j=0;j<C;j++)
                {
                    board[i][j] = sc.next().charAt(0);
                }
            }
            
            Solution obj = new Solution();
            String[] ans = obj.wordBoggle(board, dictionary);
            
            if(ans.length == 0) System.out.println("-1");
            else
            {
                Arrays.sort(ans);
                for(int i=0;i<ans.length;i++)
                {
                    System.out.print(ans[i] + " ");
                }
                System.out.println();
            }
            
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String[] wordBoggle(char board[][], String[] dictionary)
    {
        // Write your code here
        int row = board.length;
        int column = board[0].length;
        Set<String> ls = new HashSet<>();
        for(String s : dictionary){
            int l = s.length();
            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                    if(dfs(board, s, i, j, row, column, 0)){
                        ls.add(s);
                    }
                }
            }
        }
        
        // String[] words = new String[ls.size()];
        // int count=0;
        // for(String s : ls){
        //     words[count] = s;
        //     count++;
        // }
        return ls.toArray(new String[0]);
        
    }
    
    private static boolean dfs(char[][] board, String s, int i, int j, int n, int m, int idx) {
        if (i < 0 || i >= n || j < 0 || j >= m) {
            return false;
        }
        if (s.charAt(idx) != board[i][j]) {
            return false;
        }
        if (idx == s.length() - 1) {
            return true;
        }
        char temp = board[i][j];
        board[i][j] = '*';

        boolean a = dfs(board, s, i, j + 1, n, m, idx + 1);
        boolean b = dfs(board, s, i, j - 1, n, m, idx + 1);
        boolean c = dfs(board, s, i + 1, j, n, m, idx + 1);
        boolean d = dfs(board, s, i - 1, j, n, m, idx + 1);
        boolean e = dfs(board, s, i + 1, j + 1, n, m, idx + 1);
        boolean f = dfs(board, s, i - 1, j + 1, n, m, idx + 1);
        boolean g = dfs(board, s, i + 1, j - 1, n, m, idx + 1);
        boolean h = dfs(board, s, i - 1, j - 1, n, m, idx + 1);

        board[i][j] = temp;
        return a || b || c || e || f || g || h || d;
    }
}