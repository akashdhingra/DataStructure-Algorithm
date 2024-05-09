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
            int N = Integer.parseInt(br.readLine().trim());
            String[] S1 = br.readLine().trim().split(" ");
            String[] S2 = br.readLine().trim().split(" ");
            int[] KnightPos = new int[2];
            int[] TargetPos = new int[2];
            for(int i = 0; i < 2; i++){
                KnightPos[i] = Integer.parseInt(S1[i]);
                TargetPos[i] = Integer.parseInt(S2[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minStepToReachTarget(KnightPos, TargetPos, N);
            System.out.println(ans);
       }
    }
}

// } Driver Code Ends

class Pair{
    int first;
    int second;
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}

class Solution
{
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        // Code here
        int n = N;
        boolean visited[][] = new boolean[n][n];
        int knightX = KnightPos[0]-1;
        int knightY = KnightPos[1]-1;
        int targetX = TargetPos[0]-1;
        int targetY = TargetPos[1]-1;
        if(knightX == targetX && knightY == targetY){
            return 0;
        }
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(knightX, knightY));
        int moves = 0;
        while(!queue.isEmpty()){
            int s = queue.size();
            moves++;
            while(s != 0){
                int xPos = queue.peek().first;
                int yPos = queue.peek().second;
                queue.remove();
                
                int movesX[] = {1,1,-1,-1,2,-2,2,-2};
                int movesY[] = {2,-2,2,-2,1,1,-1,-1};
                
                for(int i=0;i<8;i++){
                    int newPosX = xPos + movesX[i];
                    int newPosY = yPos + movesY[i];
                    
                    if(newPosX == targetX && newPosY==targetY){
                        return moves;
                    }
                    
                    if(isValid(newPosX,newPosY, visited, n)){
                        visited[newPosX][newPosY] = true;
                        queue.add(new Pair(newPosX,newPosY));
                    }
                } 
                s--;
            }
            
        }
        
        return -1;
    }
    
    public boolean isValid(int i, int j, boolean[][] visited, int n){
        if(i>=0 && i<n && j>=0 && j<n && visited[i][j] == false){
            return true;
        }
        return false;
    }
}