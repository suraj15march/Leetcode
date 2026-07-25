class Solution {
    String fix(StringBuilder sb, int maxWidth){
        String[] strs = sb.toString().split(" ");
        int n = strs.length;
        if(n==1){
            while(sb.length()<maxWidth){
                sb.append(" ");
            }
            while(sb.length()>maxWidth){
                sb.deleteCharAt(sb.length()-1);
            }
            return sb.toString();
        }
        int count = (maxWidth-sb.length()+n)/(n-1);
        int rem = (maxWidth-sb.length()+n)%(n-1);
        StringBuilder s = new StringBuilder();
        while(count>0){
            s.append(" ");
            count--;
        }
        sb = new StringBuilder();
        for(int i=0; i<n; i++){
            // System.out.println(s);
            sb.append(strs[i]);
            if(i==n-1) continue;
            sb.append(s);
            if(i<rem) sb.append(" ");
        }
        return sb.toString();
    }
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int c=0, n=0;
        for(String str: words){
            c += str.length()+1;
            if(c<=maxWidth+1){
                sb.append(str);
                sb.append(" ");
            }
            else{
                ans.add(fix(sb, maxWidth));
                sb = new StringBuilder();
                c = str.length()+1;
                sb.append(str);
                sb.append(" ");
            }
        }
        while(sb.length()<maxWidth){
            sb.append(" ");
        }
        while(sb.length()>maxWidth){
            sb.deleteCharAt(sb.length()-1);
        }
        ans.add(sb.toString());
        return ans;
    }
}