import java.util.*;
class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length, count=0, ans=0;
        SortedMap<Integer, Integer>map = new TreeMap();
        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        // PriorityQueue<Integer>pq = new PriorityQueue(Collections.reverseOrder());
        // for(int value: map.values()){
        //     pq.offer(value);
        // }
        // while(!pq.isEmpty()){
        //     count += pq.poll();
        //     ans++;
        //     if(count>=n/2) return ans;
        // }

        ArrayList<Integer>list = new ArrayList();
        for(int value: map.values()){
            list.add(value);
        }
        Collections.sort(list);
        int m = list.size();
        for(int i=m-1; i>=0; i--){
            count += list.get(i);
            // ans++;
            if(count>=n/2) return m-i;
        }
        return 0;
    }
}