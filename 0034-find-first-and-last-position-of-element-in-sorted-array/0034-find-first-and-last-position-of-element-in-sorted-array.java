class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        int[] res = new int[2];
        int start = -1;
        while(i<=j){
            int mid = (i+j)/2;
            if(nums[mid] == target){
                start = mid;
                j = mid-1;
            }else if(nums[mid]<target){
                i = mid+1;
            }else{
                j = mid - 1;
            }
        }
        i = 0;
        j = nums.length-1;
        int end = -1;
        while(i<=j){
            int mid = (i+j)/2;
            if(nums[mid] == target){
                end = mid;
                i = mid + 1;
            }else if (nums[mid] < target) {
                i = mid + 1;
            }
            else {
                j = mid - 1;
            }
        }
        res[0] = start;
        res[1] = end;
        return res;
    }
}