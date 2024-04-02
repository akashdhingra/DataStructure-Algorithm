class MyHashMap {
    int size = 100;
    Node buckets[];
    
    class Node{
        int key;
        int value;
        Node next;
        
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        buckets = new Node[size];
    }
    
    public void put(int key, int value) {
        int index = getIndex(key);
        Node prev = find(index, key);
        if(prev.next == null)
            prev.next = new Node(key, value);
        else
            prev.next.value = value;
            
    }
    
    public int get(int key) {
        int index = getIndex(key);
        Node prev = find(index, key);
        return prev.next == null ? -1 : prev.next.value;
    }
    
    public void remove(int key) {
        int index = getIndex(key);
        Node prev = find(index, key);
        if(prev.next!=null){
            prev.next = prev.next.next;
        }
    }
    
    public int getIndex(int key){
        return Integer.hashCode(key) % size;
    }
    
    public Node find(int index, int key){
        if(buckets[index] == null)
            return buckets[index] = new Node(-1,-1);
        Node prev = buckets[index];
        while(prev.next!=null && prev.next.key != key){
            prev = prev.next;
        }
        return prev;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */