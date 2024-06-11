class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        int alt = 0, sum = 0;
        for(int i=0; i<gain.size(); i++){
            sum += gain[i];
            alt = max(alt,sum);
        }
        return alt;
    }
};