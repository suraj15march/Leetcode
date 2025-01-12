class Solution {
public:
    int numJewelsInStones(string jewels, string stones) {
        unordered_map<char, int>mp;
        int n = jewels.size(), m = stones.size(), sum=0;
        for(int i=0; i<n; i++){
            mp[jewels[i]] = 0;
        }
        for(int i=0; i<m ;i++){
            if(mp.find(stones[i])!=mp.end()){
                mp[stones[i]]++;
            }
        }
        for(auto it: mp){
            sum += it.second;
        }
        return sum;
    }
};