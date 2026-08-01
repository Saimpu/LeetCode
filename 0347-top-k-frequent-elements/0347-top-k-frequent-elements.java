import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<List<Integer>> li = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // Initialize bucket list
        for (int i = 0; i <= nums.length; i++) {
            li.add(null);
        }

        // Count frequencies
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Place numbers into buckets
        for (int num : map.keySet()) {
            int freq = map.get(num);

            if (li.get(freq) == null) {
                li.set(freq, new ArrayList<>());
            }

            li.get(freq).add(num);
        }

        // Collect top k frequent elements
        int[] res = new int[k];
        int count = 0;

        for (int i = li.size() - 1; i >= 0 && count < k; i--) {
            if (li.get(i) != null) {
                for (int num : li.get(i)) {
                    if (count == k) {
                        break;
                    }
                    res[count++] = num;
                }
            }
        }

        return res;
    }
}