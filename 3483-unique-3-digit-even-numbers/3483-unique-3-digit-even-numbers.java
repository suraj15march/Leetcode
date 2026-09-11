class Solution {
    public int totalNumbers(int[] digits) {
        // Step 1: Count available digit frequencies
        int[] count = new int[10];
        for (int d : digits) {
            count[d]++;
        }

        int total = 0;

        // Step 2: Iterate through all candidate 3-digit even numbers
        for (int num = 100; num <= 998; num += 2) {
            int d100 = num / 100;
            int d10 = (num / 10) % 10;
            int d1 = num % 10;

            // Step 3: Count required digits for the candidate number
            int[] req = new int[10];
            req[d100]++;
            req[d10]++;
            req[d1]++;

            // Step 4: Verify if digits array has enough of each digit
            boolean possible = true;
            for (int i = 0; i < 10; i++) {
                if (req[i] > count[i]) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                total++;
            }
        }

        return total;
    }
}