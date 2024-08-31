class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] result = new int[numCourses];
        int[] degree = new int[numCourses];
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            ls.add(new ArrayList<>());
        }
        
        for(int[] i : prerequisites){
            int course = i[0];
            int required = i[1];
            ls.get(required).add(course);
            degree[course]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0;i<numCourses;i++){
            if(degree[i] == 0){
                q.add(i);
            }
        }
        
        int counter = 0;
        while(!q.isEmpty()){
            int element = q.poll();
            result[counter] = element;
            counter++;
            for(int adj : ls.get(element)){
                degree[adj]--;
                if(degree[adj] == 0){
                    q.add(adj);
                }
            }
        }
        
        if(counter!=numCourses){
            return new int[0];
        }
        return result;
    }
}