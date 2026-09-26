class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String>map = new HashMap<>();
        for(int i=0; i<knowledge.size(); i++){
            map.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }
        StringBuilder str = new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                int j=i+1;
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
            else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}