class LRUCache {
    Map<Integer, Integer> map;
    int capacity;

    public LRUCache(int capacity) {
        this.map = new LinkedHashMap(capacity, 0.75f, true);
        this.capacity = capacity;
    }
    
    public int get(int key) {
        return map.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) {
        if(!map.containsKey(key) && map.size() == capacity){
            map.remove(map.keySet().iterator().next());
        }
        map.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */