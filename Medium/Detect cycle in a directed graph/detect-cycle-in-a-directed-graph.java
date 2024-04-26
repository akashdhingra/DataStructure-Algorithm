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
        boolean visited[] = new boolean[V];
        boolean recStack[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(visited[i] == false){
                if(dfsRecursion(adj, i, visited, recStack) == true){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean dfsRecursion(ArrayList<ArrayList<Integer>> adj, int start, boolean[] visited, boolean[] recStack){
        visited[start] = true;
        recStack[start] = true;
        for(int u : adj.get(start)){
            if(visited[u] == false && dfsRecursion(adj, u, visited, recStack)){
                return true;
            }
            else if(recStack[u] == true)
                return true;
        }
        recStack[start] = false;
        return false;
    }
}