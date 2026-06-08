class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for(char ch: s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else{
                switch(ch){
                    case ')':   if(stack.size() !=0 && stack.peek() == '(') {
                                    stack.pop();
                                    break;
                                }
                                else return false;
                    case '}':   if(stack.size() !=0 && stack.peek() == '{') {
                                    stack.pop();
                                    break;
                                }
                                else return false;
                    case ']':   if(stack.size() !=0 && stack.peek() == '[') {
                                    stack.pop();
                                    break;
                                }
                                else return false;
                }
            }
        }
        return stack.size() == 0;
    }
}