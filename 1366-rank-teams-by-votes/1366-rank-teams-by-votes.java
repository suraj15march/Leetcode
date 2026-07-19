class Solution {
    public String rankTeams(String[] votes) {
        int n = votes[0].length();
        int votesCount[][] = new int[26][n];
        List<Character> teams = new ArrayList<>();
        for(Character ch:votes[0].toCharArray()){
            teams.add(ch);
        }
        for(String str: votes){
            for(int j=0; j<n; j++){
                votesCount[str.charAt(j)-'A'][j]++;
            }
        }
        StringBuilder ans = new StringBuilder();
        Collections.sort(teams, (a,b) -> {
            for(int i=0; i<n; i++){
                if(votesCount[a-'A'][i] != votesCount[b-'A'][i])
                    return votesCount[b-'A'][i] - votesCount[a-'A'][i];
            }
            return a-b;
        });

        for(Character ch: teams) ans.append(ch);
        
        return ans.toString();
    }
}