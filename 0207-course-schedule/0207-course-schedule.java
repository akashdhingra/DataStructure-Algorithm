class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        int[] inDegree = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            ls.add(new ArrayList<>());
        }
        
        for(int[] i : prerequisites){
            int course = i[0];
            int pre = i[1];
            ls.get(pre).add(course);
            inDegree[course]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0;i<numCourses;i++){
            if(inDegree[i] == 0){
                q.add(i);
            }
        }
        int counter = 0;
        while(!q.isEmpty()){
            int u = q.poll();
            counter++;
            for(int v : ls.get(u)){
                inDegree[v]--;
                if(inDegree[v] == 0){
                    q.add(v);
                }
            }
        }
        
        if(counter!=numCourses){
            return false;
        }
        return true;
    }
}