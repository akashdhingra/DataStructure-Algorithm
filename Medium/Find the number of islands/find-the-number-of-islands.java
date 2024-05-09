//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
        if(grid == null || grid.length == 0 || grid[0].length == 0){
            return 0;
        }
        int rows = grid.length;
        int columns = grid[0].length;
        int count = 0;
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(grid[i][j] == '1'){
                    dfs(grid, i ,j);
                    count++;
                }
            }
        }
        return count;
    }
    
    public void dfs(char[][] grid, int i, int j){
        int row = grid.length;
        int column = grid[0].length;
        
        if(i < 0 || i >= row || j < 0 || j >= column || grid[i][j]!='1'){
            return;
        }
        grid[i][j] = '0';
        
        dfs(grid,i+1,j); // down
        dfs(grid,i-1,j); // up
        dfs(grid,i,j+1); // right
        dfs(grid,i,j-1); // left
        dfs(grid,i-1,j-1); // diagonal up left
        dfs(grid,i-1,j+1); // diagonal up right
        dfs(grid,i+1,j-1); // diagonal down left
        dfs(grid,i+1,j+1); // diagonal down right
    }
}