class Solution {
public:
    string countNsay(int n, char c){
        // cout<<n<<" "<<c<<endl;
        return to_string(n)+c;
    }
    string rel(string s){
        int n = s.size(),c=0,i=0;
        string ans = "";
        char a = s[0];
        while(i<n){
            if(a==s[i]){
                c++;
            }
            else{
                ans += countNsay(c,a);
                a = s[i];
                c=1;
            }
            i++;
        }
        ans += countNsay(c,a);
        return ans;
    }
    string countAndSay(int n) {
        vector<string> res(31,"");
        if(n==1) return "1";
        if(res[n]=="") res[n] = rel(countAndSay(n-1));
        return res[n];
    }
};