class Solution {

    public long sumSubarrayMins(int[] nums) {
        int n = nums.length;
        long sum = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] > nums[i]) {
                st.pop();
            }
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        st.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) {
                st.pop();
            }
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        for (int i = 0; i < n; i++) {
            long leftChoices = i - left[i];
            long rightChoices = right[i] - i;
            sum += (long) nums[i] * leftChoices * rightChoices;
        }
        return sum;
    }
    public long sumSubarrayMaxs(int[] nums) {
        int n = nums.length;
        long sum = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] < nums[i]) {
                st.pop();
            }
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        st.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] <= nums[i]) {
                st.pop();
            }
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        for (int i = 0; i < n; i++) {
            long leftChoices = i - left[i];
            long rightChoices = right[i] - i;
            sum += (long) nums[i] * leftChoices * rightChoices;
        }
        return sum;
    }


    public long subArrayRanges(int[] nums) {

        long maxSum = sumSubarrayMaxs(nums);
        long minSum = sumSubarrayMins(nums);

        return maxSum - minSum;
    }
}