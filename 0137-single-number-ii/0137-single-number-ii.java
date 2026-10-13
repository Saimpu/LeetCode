class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        long ss = 0;
        long total = 0;
        for(int num : nums){
            total +=num;
            set.add(num);
        }
        for(int num : set){
            ss+=num;
        }
        return (int)((3L*ss - total)/2);
    }
}