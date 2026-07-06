class Solution {
    public int longestNiceSubarray(int[] nums) {
        int windowSet=0;
        int i=0;
        int max=0;
        for(int j=0;j<nums.length;j++){
           
            while((windowSet & nums[j])!=0){
                windowSet ^=nums[i];
                i++;
            }
            windowSet |=nums[j];
            max=Math.max(max,j-i+1);
        }
        return max;
    }
}