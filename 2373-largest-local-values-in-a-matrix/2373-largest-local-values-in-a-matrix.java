class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] result = new int[n-2][n-2];
        for(int i=0;i<n-2;i++){
            for(int j=0;j<grid[i].length-2; j++){
                result[i][j] = getMax(grid, i ,j);
            }
        }
        return result;
    }
    
    private int getMax(int[][] grid, int l, int r){
        int maxValue = 0;
        for(int i=l;i<l+3; i++){
            for(int j=r;j<r+3; j++){
                maxValue = Math.max(maxValue, grid[i][j]);
            }
        }
        return maxValue;
    }
    
}