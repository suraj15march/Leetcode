class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for(char ch: s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else{
                switch(ch){
                    case ')':   if(stack.isEmpty() || stack.peek() != '(') 
                                    return false;
                                else{
                                    stack.pop();
                                    break;
                                }
                    case '}':   if(stack.isEmpty() || stack.peek() != '{') 
                                    return false;
                                else{
                                    stack.pop();
                                    break;
                                }
                    case ']':   if(stack.isEmpty() || stack.peek() != '[') 
                                    return false;
                                else{
                                    stack.pop();
                                    break;
                                }
                }
            }
        }
        return stack.isEmpty();
    }
}