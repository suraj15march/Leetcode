class Solution {
public:
    int maximumNumberOfStringPairs(vector<string>& words) {
        int n = words.size(), count = 0;
        for(int i=0; i<n ;i++){
            string str_rev = words[i];
            reverse(str_rev.begin(), str_rev.end());
            for(int j=i+1; j<n; j++){
                if(str_rev == words[j])
                    count++;
            }
        }
        return count;
    }
};