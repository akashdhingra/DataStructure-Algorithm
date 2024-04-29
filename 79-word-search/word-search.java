class Solution {
    public boolean exist(char[][] board, String word) {
        
        int n = board.length;
        int m = board[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] == word.charAt(0)){
                    boolean[][] visited = new boolean[n][m];
                    if(DFS(board, word, i, j, visited)){
                        return true;
                    }
                }
            }
        }
        
        return false;
        
    }
    
    public boolean DFS(char[][] board, String word, int row, int column, boolean[][] visited){
        if(word.length()==0){
            return true;
        }
        
        if(row< 0 || row>=board.length || column < 0 || column >= board[0].length || visited[row][column] || board[row][column] != word.charAt(0)){
            return false;
        }
        
        visited[row][column] = true;
        int[] rows = {-1, 0, 1, 0};
        int[] columns = {0, 1, 0, -1};
        
        for(int i=0;i<4;i++){
            if(DFS(board, word.substring(1), row + rows[i], column + columns[i], visited)){
                return true;
            }
        }
        visited[row][column] = false;
        return false;
    }
}