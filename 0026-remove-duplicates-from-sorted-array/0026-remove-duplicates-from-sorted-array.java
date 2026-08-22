class Solution {
    public int removeDuplicates(int[] n) {
        int j = 1;

        for (int i = 1; i < n.length; i++) {
            if (n[i] != n[j - 1]) {
                n[j] = n[i];
                j++;
            }
        }

        return j;
    }
}