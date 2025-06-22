class Solution {
    public String[] divideString(String s, int k, char fill) {
       
        int groups = (s.length() + k - 1) / k;
        String[] result = new String[groups];

        int start = 0;
        for (int i = 0; i < groups; i++) {
            String part = "";

            for (int j = 0; j < k; j++) {
                if (start < s.length()) {
                    part += s.charAt(start);
                } else {
                    part += fill; 
                }
                start++;
            }

            result[i] = part;
        }

        return result;
    }
}
