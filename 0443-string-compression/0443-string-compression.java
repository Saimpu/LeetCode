class Solution {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;

        while (read < chars.length) {
            char current = chars[read];
            int count = 0;

            // Count consecutive occurrences
            while (read < chars.length && chars[read] == current) {
                count++;
                read++;
            }

            // Write the character
            chars[write++] = current;

            // Write the count if greater than 1
            if (count > 1) {
                String str = String.valueOf(count);
                for (char ch : str.toCharArray()) {
                    chars[write++] = ch;
                }
            }
        }

        return write;
    }
}