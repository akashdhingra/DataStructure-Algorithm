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