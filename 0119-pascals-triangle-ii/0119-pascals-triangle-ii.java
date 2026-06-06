class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer> > result = new ArrayList<>(rowIndex);
        for(int i=0; i<=rowIndex; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i) temp.add(1);
                else{
                    if(i>0 && j>0){
                        temp.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                    }
                }
            }
            result.add(temp);
        }
        return result.get(rowIndex);
    }
}