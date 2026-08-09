class Solution {
    public int numberOfBeams(String[] bank) {

        int previous = 0;
        int ans = 0;

        for (String row : bank) {

            int current = 0;

            for (char ch : row.toCharArray()) {
                if (ch == '1') {
                    current++;
                }
            }

            if (current > 0) {
                ans += previous * current;
                previous = current;
            }
        }

        return ans;
    }
}