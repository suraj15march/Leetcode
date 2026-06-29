class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        StringBuilder sb = new StringBuilder(word);
        for(String str: patterns){
            if(sb.indexOf(str)!=-1) count++;
        }
        return count;
    }
}