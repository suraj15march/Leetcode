class Pair {
    String str;
    int timestamp;

    Pair(String str, int timestamp) {
        this.str = str;
        this.timestamp = timestamp;
    }
}

class TimeMap {
    Map<String, List<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Pair(value, timestamp));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";
        String ans = "";
        List<Pair> list = map.get(key);
        int low = 0, high = list.size()-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(list.get(mid).timestamp <= timestamp){
                ans = list.get(mid).str;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */