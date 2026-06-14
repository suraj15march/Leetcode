class Solution {
    public boolean isAlienSorted(String[] w, String o) {
        int n = w.length, m = w[0].length();
        for(int i=1; i<n; i++){
            String w1 = w[i-1], w2 = w[i];
            for(int j=0; j<w1.length(); j++){
                if(j==w2.length()) return false;
                char c1 = w1.charAt(j), c2 = w2.charAt(j);
                if(o.indexOf(c1)<o.indexOf(c2)) break;
                if(o.indexOf(c1)>o.indexOf(c2)) return false;
            }
        }
        return true;
    }
}