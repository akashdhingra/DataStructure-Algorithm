//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean[] visited = new boolean[V];
        boolean[] ancestor = new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(dfs(i,adj,visited,ancestor)){
                    return true;
                }
            }
        }
        return false;
    }
    
    boolean dfs(int start, ArrayList<ArrayList<Integer>> adj, 
                boolean[] visited, boolean[] ancestor){
        visited[start] = true;
        ancestor[start] = true;
        for(int u:adj.get(start)){
            if(visited[u] == false && dfs(u,adj,visited,ancestor)){
                return true;
            }
            else if(ancestor[u]){
                return true;
            }
            
        }
        ancestor[start] = false;
        return false;
    }
    
    
}