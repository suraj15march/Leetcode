class Spreadsheet {
    Map<String, Integer> map;

    public Spreadsheet(int rows) {
        map = new HashMap<>();
    }

    public void setCell(String cell, int value) {
        map.put(cell, value);
    }

    public void resetCell(String cell) {
        map.put(cell, 0);
    }

    public int getValue(String formula) {
        if (map.containsKey(formula))
            return map.get(formula);
        return calculate(formula.substring(1));
    }

    int calculate(String s) {
        String[] list = s.split("\\+");
        int sum = 0;
        for (String op : list) {
            if (map.containsKey(op)) {
                sum += map.get(op);
            } else {
                try {
                    sum += Integer.parseInt(op);
                } catch (NumberFormatException e) {
                    // Ignore invalid numbers or missing cell references by adding 0
                    sum += 0;
                }
            }
        }
        return sum;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */