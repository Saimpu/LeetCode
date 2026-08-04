class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max =0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            if(nums[i]<min){
                min = nums[i];
            }
            if(nums[i]>max){
                max = nums[i];
            }
        }
        List<Integer> li = new ArrayList<>();
        for(int i=min;i<max;i++){
            if(!set.contains(i)){
                li.add(i);
            }
        }
        li.sort(Integer::compareTo);
        return li;
    }
}