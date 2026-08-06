class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean seen[] = new boolean[1001];
        for(int i : nums1){
            seen[i] = true;
        }
        int result[] = new int[nums2.length];
        int idx = 0;
        for(int i : nums2){
            if(seen[i] == true){
                result[idx++] = i;
                seen[i] = false;
            }
        }
        return Arrays.copyOf(result,idx);
    }
}