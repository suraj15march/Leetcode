class RandomizedSet {

    ArrayList<Integer>set;

    public RandomizedSet() {
        set = new ArrayList<Integer>();
    }
    
    public boolean insert(int val) {
        if(set.contains(val))
            return false;
        set.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(set.contains(val)){
            set.remove(Integer.valueOf(val));
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        Random random = new Random();
        int index = random.nextInt(set.size());
        // return set.get(index);
        return set.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */