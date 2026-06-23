class Solution {
    public String addBinary(String a, String b) {
        int n = a.length()-1, m = b.length()-1;
        StringBuilder sb = new StringBuilder();
        char carry = '0';
        while(n>=0 || m>=0){
            char ch1, ch2;
            if(n<0) ch1 = '0'; else ch1 = a.charAt(n);
            if(m<0) ch2 = '0'; else ch2 = b.charAt(m);
            if(carry == '0'){
                if(ch1=='1' && ch2 == '1'){
                    sb.append('0');
                    carry = '1';
                }
                else if(ch1=='1' || ch2 == '1') sb.append('1');
                else sb.append('0');
            }
            else{
                if(ch1=='1' && ch2 == '1'){
                    sb.append('1');
                    carry = '1';
                }
                else if(ch1=='1' || ch2 == '1'){ 
                    sb.append('0');
                    carry = '1';
                }
                else{
                    sb.append('1');
                    carry = '0';
                }
            }
            n--;
            m--;
        }
        if(carry == '1') sb.append('1');
        sb.reverse();
        return sb.toString();
    }
}