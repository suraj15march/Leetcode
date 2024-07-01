class Solution {
public:
    bool isPalindrome(string s) {
        int n = s.size();
        int i = 0, j = n-1;
        while(i < j){
            if(s[i]>='A' && s[i]<='Z')
                s[i] += 'a'-'A';
            if(s[j]>='A' && s[j]<='Z')
                s[j] += 'a'-'A';
            if((s[i]<'a' || s[i]>'z') && (s[i]<'0' || s[i]>'9')){
                i++;
                continue;
            }
            if((s[j]<'a' || s[j]>'z') && (s[j]<'0' || s[j]>'9')){
                j--;
                continue;
            }
            if(s[i] != s[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
};