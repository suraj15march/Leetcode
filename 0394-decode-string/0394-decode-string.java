class Solution {
    public String decodeString(String s) {
        Stack<Integer>intStack = new Stack();
        Stack<StringBuilder>strStack = new Stack();
        int i=0, n = s.length();
        int num = 0;
        StringBuilder sb = new StringBuilder();
        while(i<n){
            char ch = s.charAt(i++);
            if(Character.isDigit(ch)){
                num *= 10;
                num += ch - '0';
            }
            else if(ch == '['){
                intStack.push(num);
                strStack.push(sb);
                num = 0;
                sb = new StringBuilder();
            }
            else if(ch == ']'){
                StringBuilder temp = sb;
                sb = strStack.pop();
                int count = intStack.pop();
                while(count>0){
                    sb.append(temp);
                    count--;
                }
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}