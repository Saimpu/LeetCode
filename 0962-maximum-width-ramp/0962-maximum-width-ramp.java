class Solution {
    public int maxWidthRamp(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            if (stack.isEmpty() || nums[i] < nums[stack.peek()]) {
                stack.push(i);
            }
        }
        int ans = 0;
        for (int j = nums.length - 1; j >= 0; j--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[j]) {
                int i = stack.pop();
                ans = Math.max(ans, j - i);
            }
        }
        return ans;
    }
}