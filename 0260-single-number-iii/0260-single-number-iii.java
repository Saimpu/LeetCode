class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;

        for (int num : nums) {
            xor ^= num;
        }

        int bit = xor & -xor;

        int x = 0;
        int y = 0;

        for (int num : nums) {
            if ((num & bit) != 0) {
                x ^= num;
            } else {
                y ^= num;
            }
        }

        return new int[]{x, y};
    }
}