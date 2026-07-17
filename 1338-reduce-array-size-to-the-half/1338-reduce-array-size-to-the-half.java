import java.util.*;
class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length, count=0;
        Map<Integer, Integer>map = new HashMap();
        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer>list = new ArrayList();
        for(int value: map.values()){
            list.add(value);
        }
        Collections.sort(list);
        int m = list.size();
        for(int i=m-1; i>=0; i--){
            count += list.get(i);
            if(count>=n/2) return m-i;
        }
        return 0;
    }
}