class Solution {
    public int minSubarray(int[] nums, int p) {
        long total = 0;

        for (int num : nums) {
            total += num;
        }

        int rem = (int)(total % p);

        if (rem == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        long prefix = 0;
        int ans = nums.length;

        for (int i = 0; i < nums.length; i++) {

            prefix += nums[i];

            int currentRem = (int)(prefix % p);

            int requiredRem = (currentRem - rem + p) % p;

            if (map.containsKey(requiredRem)) {
                int prevIndex = map.get(requiredRem);
                ans = Math.min(ans, i - prevIndex);
            }

            map.put(currentRem, i);
        }

        return ans == nums.length ? -1 : ans;
    }
}