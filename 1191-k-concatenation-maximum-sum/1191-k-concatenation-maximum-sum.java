class Solution {
    static final int MOD = 1000000007;

    public int kConcatenationMaxSum(int[] arr, int k) {
        long totalSum = 0;

        for (int num : arr) {
            totalSum += num;
        }

        if (k == 1) {
            return (int) (kadane(arr) % MOD);
        }

        // Create two concatenated arrays
        int n = arr.length;
        int[] twice = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            twice[i] = arr[i % n];
        }

        long maxSum = kadane(twice);

        if (totalSum > 0) {
            maxSum += (long) (k - 2) * totalSum;
        }

        return (int) (maxSum % MOD);
    }

    private long kadane(int[] nums) {
        long maxSoFar = 0;
        long currentSum = 0;

        for (int num : nums) {
            currentSum = Math.max(0, currentSum + num);
            maxSoFar = Math.max(maxSoFar, currentSum);
        }

        return maxSoFar;
    }
}