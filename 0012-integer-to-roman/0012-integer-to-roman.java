class Solution {
    // 3749 = 3000 + 700 + 40 + 9 = 3000 + 500 + 200 + 40 + 5 + 4 = 3000 + 500 + 200 + 50 - 10 + 10 - 1
    // MMMDCCXLIX
    // MMMCCCCCCXXXXXIIIIIIII
    // 58 = 50 + 5 + 3 = LVIII
    // 1994 = 1000 + 900 + 90 + 4 = 1000 + 1000-100 + 100-10 + 5-1 = MCMXCIV

    public String intToRoman(int num) {
        int i = 0;
        int[] arr = new int[4];
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            arr[i++] = num % 10;
            num /= 10;
        }

        switch (arr[3]) {
            case 1:
                sb.append("M");
                break;
            case 2:
                sb.append("MM");
                break;
            case 3:
                sb.append("MMM");
                break;
        }
        switch (arr[2]) {
            case 1:
                sb.append("C");
                break;
            case 2:
                sb.append("CC");
                break;
            case 3:
                sb.append("CCC");
                break;
            case 4:
                sb.append("CD");
                break;
            case 5:
                sb.append("D");
                break;
            case 6:
                sb.append("DC");
                break;
            case 7:
                sb.append("DCC");
                break;
            case 8:
                sb.append("DCCC");
                break;
            case 9:
                sb.append("CM");
                break;
        }

        switch (arr[1]) {
            case 1:
                sb.append("X");
                break;
            case 2:
                sb.append("XX");
                break;
            case 3:
                sb.append("XXX");
                break;
            case 4:
                sb.append("XL");
                break;
            case 5:
                sb.append("L");
                break;
            case 6:
                sb.append("LX");
                break;
            case 7:
                sb.append("LXX");
                break;
            case 8:
                sb.append("LXXX");
                break;
            case 9:
                sb.append("XC");
                break;
        }
        switch (arr[0]) {
            case 1:
                sb.append("I");
                break;
            case 2:
                sb.append("II");
                break;
            case 3:
                sb.append("III");
                break;
            case 4:
                sb.append("IV");
                break;
            case 5:
                sb.append("V");
                break;
            case 6:
                sb.append("VI");
                break;
            case 7:
                sb.append("VII");
                break;
            case 8:
                sb.append("VIII");
                break;
            case 9:
                sb.append("IX");
                break;
        }

        return sb.toString();
    }
}