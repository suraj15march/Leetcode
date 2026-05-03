class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder result = new StringBuilder();
        List<StringBuilder> listStrings = new ArrayList<>();

        // FIX: create separate StringBuilder for each row
        for (int i = 0; i < numRows; i++) {
            listStrings.add(new StringBuilder());
        }

        int count = 0;
        boolean goingDown = true;

        for (char ch : s.toCharArray()) {
            listStrings.get(count).append(ch);

            // change direction at boundaries
            if (count == 0) {
                goingDown = true;
            } else if (count == numRows - 1) {
                goingDown = false;
            }

            count += goingDown ? 1 : -1;
        }

        for (StringBuilder row : listStrings) {
            result.append(row);
        }

        return result.toString();
    }
}