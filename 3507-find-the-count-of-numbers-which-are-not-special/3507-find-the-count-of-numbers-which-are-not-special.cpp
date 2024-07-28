class Solution {
    int prime[1000];
public:
    int nonSpecialCount(int l, int r) {
        int n = sqrt(r);
        vector<bool>prime(n+1,true);
        for(int i=1;i<=n;i++){
            if(i==1) {
                prime[i]=false;
                continue;
            }
            if(prime[i]==false) continue;
            for(int j=i*i;j<=n;j=j+i){
                prime[j]=false;
            }
        }
        int c=0;
        for(int i=2;i<=n;i++){
            if(prime[i] && (i*i>=l && i*i<=r))
                c++;
        }
        return r-l+1-c;
    }
};