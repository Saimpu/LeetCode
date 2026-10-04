import java.util.*;

class Solution {
    public int maxSumMinProduct(int[] nums) {
        int n = nums.length;
        long MOD = 1_000_000_007L;
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        Deque<Integer> stack = new ArrayDeque<>();
        long ans = 0;
        for (int i = 0; i <= n; i++) {
            long curr = (i == n) ? 0 : nums[i];
            while (!stack.isEmpty() && nums[stack.peek()] > curr) {
                int mid = stack.pop();
                int left = stack.isEmpty() ? 0 : stack.peek() + 1;
                int right = i - 1;
                long sum = prefix[right + 1] - prefix[left];
                long product = (long) nums[mid] * sum;
                ans = Math.max(ans, product);
            }
            if (i < n) {
                stack.push(i);
            }
        }

        return (int) (ans % MOD);
    }
}
