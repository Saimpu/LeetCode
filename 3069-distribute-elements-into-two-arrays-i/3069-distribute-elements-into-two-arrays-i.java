class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> li1 = new ArrayList<>();
        List<Integer> li2 = new ArrayList<>();

        li1.add(nums[0]);
        li2.add(nums[1]);

        for (int i = 2; i < nums.length; i++) {
            if (li1.get(li1.size() - 1) > li2.get(li2.size() - 1)) {
                li1.add(nums[i]);
            } else {
                li2.add(nums[i]);
            }
        }
        li1.addAll(li2);

        int[] arr = new int[li1.size()];

        for (int i = 0; i < li1.size(); i++) {
            arr[i] = li1.get(i);
        }

        return arr;
    }
}