class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            set.add(n);

            int ans = 0;

            while (n > 0) {
                int digit = n % 10;
                ans += digit * digit;
                n /= 10;
            }

            n = ans;
        }

        return n == 1;
    }
}