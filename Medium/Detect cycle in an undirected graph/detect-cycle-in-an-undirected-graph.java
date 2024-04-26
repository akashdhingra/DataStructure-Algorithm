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
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean visited[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(visited[i] == false){
                if((dfsRecursive(adj, i, visited,-1)) == true)
                    return true;
            }
        }
        return false;
    }
    
    public boolean dfsRecursive(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, int parent){
        visited[s] = true;
        for(int u : adj.get(s)){
            if(visited[u] == false){
                if((dfsRecursive(adj, u, visited, s)) == true){
                    return true;
                }
            }
            else if(u!= parent){
                return true;
            }
        }
        return false;
    }
}