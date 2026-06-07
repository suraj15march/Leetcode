class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder res = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for(int i=n-1; i>=0; i--){
            if(s.charAt(i) != ' '){
                temp.append(s.charAt(i));
            }
            else{
                if(temp.length()>0){
                    temp.reverse();
                    res.append(temp);
                    res.append(' ');
                }
                temp = new StringBuilder();
            }
        }
        if(temp.length()>0){
            temp.reverse();
            res.append(temp);
        }
        return res.toString().trim();
    }
}