class Solution {
    public void wiggleSort(int[] nums) {
        int arr[] = Arrays.copyOf(nums,nums.length);
        Arrays.sort(arr);
        int l = (nums.length-1)/2;
        int r = (nums.length-1);
        boolean c = true;
        for(int i=0;i<nums.length;i++){
            if(c){
                nums[i] = arr[l];
                l--;
                c=false;
            }else{
                nums[i] = arr[r];
                r--;
                c=true;
            }
        }
    }
}