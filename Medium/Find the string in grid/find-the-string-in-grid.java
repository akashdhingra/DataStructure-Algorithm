//{ Driver Code Starts
//Initial Template for Java

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
            String[] s1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            char[][] grid = new char[n][m];
            for(int i = 0; i < n; i++){
                String S = br.readLine().trim();
                for(int j = 0; j < m; j++){
                    grid[i][j] = S.charAt(j);
                }
            }
            String word = br.readLine().trim();
            Solution obj = new Solution();
            int[][] ans = obj.searchWord(grid, word);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
            if(ans.length==0)
            {
                System.out.println("-1");
            }

        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public int[][] searchWord(char[][] grid, String word) {
        List<int[]> present = new ArrayList<>();
        int n = grid.length;
        int m = grid[0].length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == word.charAt(0)) {
                    for (int k = 0; k < 8; k++) { // Iterate over all 8 directions
                        if (DFS(grid, word, i, j, k)) {
                            present.add(new int[]{i, j});
                            break; // Break after finding the word in one direction
                        }
                    }
                }
            }
        }
        
        // Convert list to 2D array
        int[][] result = new int[present.size()][2];
        for (int i = 0; i < present.size(); i++) {
            result[i] = present.get(i);
        }
        return result;
    }
    
    private boolean DFS(char[][] grid, String word, int row, int column, int direction) {
        if (word.isEmpty()) {
            return true;
        }
        
        int n = grid.length;
        int m = grid[0].length;
        
        if (row < 0 || row >= n || column < 0 || column >= m || grid[row][column] != word.charAt(0)) {
            return false;
        }
        
        // Define the changes in row and column for each direction
        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};
        
        // Move in the specified direction
        int newRow = row + dr[direction];
        int newColumn = column + dc[direction];
        
        // Recur for the next character in the word and the next position
        return DFS(grid, word.substring(1), newRow, newColumn, direction);
    }
}