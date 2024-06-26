//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        
        ArrayList<ArrayList<Integer>> adjs = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<V;i++){
            adjs.add(new ArrayList<Integer>());
        }
        
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(adj.get(i).get(j) == 1 && i!=j){
                    adjs.get(i).add(j);
                    adjs.get(j).add(i);
                }
            }
        }
        int[] visited = new int[V];
        int count=0;
        for(int i=0;i<V;i++){
            if(visited[i] == 0){
                count++;
                dfs(adjs, i, visited);
            }
        }
        return count;
    }
    
    static void dfs(ArrayList<ArrayList<Integer>> adjs, int node, int[] visited){
        visited[node] = 1;
        for(int i : adjs.get(node)){
            if(visited[i] == 0){
                dfs(adjs, i, visited);
            }
            
        }
    }
}