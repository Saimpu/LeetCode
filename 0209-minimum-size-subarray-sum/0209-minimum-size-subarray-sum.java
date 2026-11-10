class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int j = 0;
        int sum =0;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            while(sum>=target){
                int size = i-j+1;
                if(size<min){
                    min = size;
                }
                sum -= nums[j];
                j++;
            }
        }
        return (min==Integer.MAX_VALUE)?0:min;
    }
}