class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String>map = new HashMap<>();
        for(int i=0; i<knowledge.size(); i++){
            map.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }
        StringBuilder str = new StringBuilder();
        int i=0, j=0, n=s.length();
        while(i<=j && j<n){
            if(s.charAt(i)=='('){
                j=i+1;
                while(s.charAt(j) != ')'){
                    j++;
                }
                String temp = s.substring(i+1, j);
                if(map.containsKey(temp))
                    str.append(map.get(temp));
                else
                    str.append("?");
                i=j;
            }
            if(s.charAt(i) == ')'){
                i++;
                j++;
                continue;
            }
            str.append(s.charAt(i));
            i++;
            j++;
        }
        return str.toString();
    }
}