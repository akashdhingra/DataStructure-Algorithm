// Simple BFS is used on the Graph
// And if any of the vertex is not visited then it means we dont have the key,
//  so we return false
// Other if all are true then it means all the rooms has been visited,
// so we return true

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visited[] = new boolean[rooms.size()];
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(0);
        while(q.isEmpty() == false){
            int u = q.poll();
            visited[u] = true;
            for(int v : rooms.get(u)){
                if(visited[v] == false)
                    q.add(v);
            }
        }
        
        for(boolean i : visited){
            if(i == false)
                return false;
        }
        
        
        // System.out.print(rooms.size() + 1);
        return true;
        
    }
}