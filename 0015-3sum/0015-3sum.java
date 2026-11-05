class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            int l = i+1;
            int r = nums.length-1;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            while(l<r){
                int total = nums[i]+nums[l]+nums[r];
                if(total == 0){
                    List<Integer> li = new ArrayList<>();
                    li.add(nums[i]);
                    li.add(nums[l]);
                    li.add(nums[r]);
                    ans.add(li);
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }
                }else if(total>0){
                    r--;
                }else{
                    l++;
                }
            }
        }
        return ans;
    }
}