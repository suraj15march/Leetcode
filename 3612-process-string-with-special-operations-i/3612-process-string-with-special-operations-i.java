class Solution {
    public void duplicate(Stack<Character> st){
        StringBuilder str = new StringBuilder();
        while(!st.empty()){
            str.append(st.peek());
            st.pop();
        }
        str.append(str);
        str.reverse();
        for(char ch: str.toString().toCharArray())   st.push(ch);
    }
    public void reverse(Stack<Character> st){
        StringBuilder str = new StringBuilder();
        while(!st.empty()){
            str.append(st.peek());
            st.pop();
        }
        for(char ch: str.toString().toCharArray())   st.push(ch);
    }

    public String processStr(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char ch: s.toCharArray()){
            switch(ch){
                case '*': if(!st.empty()) st.pop(); break;
                case '#': duplicate(st); break;
                case '%': reverse(st); break;
                default: st.push(ch);
            }
        }
        while(!st.empty()){
            ans.append(st.peek());
            st.pop();
        }
        ans.reverse();
        return ans.toString();
    }
}