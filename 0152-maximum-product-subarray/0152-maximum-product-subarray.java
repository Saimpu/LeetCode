class Solution {
    public int maxProduct(int[] nums) {
        int maxP = nums[0];
        int minP = nums[0];
        int ans = nums[0];
        for(int i=1;i<nums.length;i++){
           if(nums[i]<0){
                int temp=maxP;
                maxP = minP;
                minP = temp;
            }
            maxP = Math.max(nums[i],nums[i]*maxP);
            minP = Math.min(nums[i],nums[i]*minP);
            ans = Math.max(maxP,ans);
        }
        return ans;
    }
}