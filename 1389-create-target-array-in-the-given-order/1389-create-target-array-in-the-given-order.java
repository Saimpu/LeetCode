class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> li = new ArrayList<>();
        for(int i = 0; i<nums.length;i++){
            li.add(index[i],nums[i]);
        }
        int[] arr = new int[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i] = li.get(i);
        }
        return arr;
    }
}