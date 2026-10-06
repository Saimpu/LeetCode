class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sets = new ArrayList<>();
        
        int n = nums.length;
        for(int i = 0;i<(1<<n);i++){
            List<Integer> set = new ArrayList<>();
            for(int j = 0;j<n;j++){
                if(getKB(i,j)){
                    set.add(nums[j]);
                }
            }
            sets.add(set);
        }
        return sets;
    }
    boolean getKB(int n,int k){
        return (n & (1<<k))!=0;
    }
}