class Solution {
    public int findMaxLength(int[] nums) {
        int sum = 0;
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        // map.put(-1,0);
        map.put(0,-1);
        for(int j = 0;j<nums.length;j++){
            int n = nums[j];
            if(n == 0){
                sum+=-1;
            }else{
                sum +=1;
            }
            if(map.containsKey(sum)){
                max = Math.max(max , j - map.get(sum));
            }else{
                map.put(sum,j);
            }
        }
        return max;
    }
}