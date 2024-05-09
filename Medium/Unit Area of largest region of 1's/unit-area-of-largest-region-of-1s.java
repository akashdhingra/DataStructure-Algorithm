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
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.findMaxArea(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find unit area of the largest region of 1s.
    public int findMaxArea(int[][] grid)
    {
        // Code here
        int row = grid.length;
        if(row==0){
            return 0;
        }
        int column = grid[0].length;
        boolean[][] visited = new boolean[row][column];
        int maxSum = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    int CalculatedSum = dfs(grid, i, j, visited);
                    maxSum = Math.max(maxSum,CalculatedSum);
                }
            }
        }
        return maxSum;
    }
    
    public int dfs(int[][] grid, int r, int c, boolean[][] visited){
        int[][] moves = {{-1,0},{1,0},{0,1},{0,-1},{-1,-1},{-1,1},{1,-1},{1,1}};
        int rows = grid.length;
        int columns = grid[0].length;
        visited[r][c] = true;
        int size = 1;
        for(int[] nums : moves){
            int row = r + nums[0];
            int col = c + nums[1];
            if(isValid(grid,row,col,visited)){
                size += dfs(grid, row, col, visited);
            }
            
        }
        return size;
    }
    
    public boolean isValid(int[][] grid, int r, int c, boolean[][] visited){
        int row = grid.length;
        int column = grid[0].length;
        if(r<0 || r>=row || c<0 || c>=column || grid[r][c] == 0 || visited[r][c]){
            return false;
        }
        return true;
    }
    
    
    
}