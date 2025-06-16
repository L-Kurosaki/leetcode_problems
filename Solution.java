class Solution {
    public int minMaxDifference(int num) {
        int max_v, min_v;
        String max = "";
        String min = "";

        String number = Integer.toString(num);
        int i = 0;

        // Find first digit that's not 9 for max replacement
        char replaceMax = ' ';
        int j = 0;
        while (j < number.length()) {
            if (number.charAt(j) != '9') {
                replaceMax = number.charAt(j);
                break;
            }
            j++;
        }

        // First digit for min replacement
        char replaceMin = number.charAt(0);

        // Build max and min strings
        while (i < number.length()) {
            char currentChar = number.charAt(i);

            // max: replace all replaceMax digits with '9'
            if (currentChar == replaceMax) {
                max += '9';
            } else {
                max += currentChar;
            }

            // min: replace all replaceMin digits with '0'
            if (currentChar == replaceMin) {
                min += '0';
            } else {
                min += currentChar;
            }

            i++;
        }

        max_v = Integer.parseInt(max);
        min_v = Integer.parseInt(min);

        return max_v - min_v;
    }
}