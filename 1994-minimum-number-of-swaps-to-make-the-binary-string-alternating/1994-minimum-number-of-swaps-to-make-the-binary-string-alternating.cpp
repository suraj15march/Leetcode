class Solution {
public:
    int minSwaps(string s) {
        int count_zero = 0, count_one = 0, n = s.size();
        string a = "", b = "";
        for(int i=0; i<n; i++){
            if(s[i]=='0') count_zero++;
            else count_one++;
            if(i%2) {
                a += "1";
                b += "0";
            }
            else{
                a += "0";
                b += "1";
            }
        }
        if(abs(count_zero-count_one)>1) return -1;
        int count1 = 0, count2 = 0;
        for(int i=0; i<n; i++){
            if(s[i] != a[i]) count1++;
            if(s[i] != b[i]) count2++;
        }
        if(count_one > count_zero) return count2/2;
        else if(count_zero > count_one) return count1/2;
        return min((count1)/2, (count2)/2);
    }
};