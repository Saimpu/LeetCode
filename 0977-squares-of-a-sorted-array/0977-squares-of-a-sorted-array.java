class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i = 0 ;
        int j = n-1;
        int temp[] = new int[n];
        for(int p = n-1; p >= 0 ; p--){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                temp[p] = nums[i]*nums[i];
                i++;
            }else{
                temp[p] = nums[j]*nums[j];
                j--;
            }
        }
        return temp;
    }
}