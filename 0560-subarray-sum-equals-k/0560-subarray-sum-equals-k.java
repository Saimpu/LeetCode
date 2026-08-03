class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int PA=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            PA +=nums[i];
            if(map.containsKey(PA-k)){
                count+=map.get(PA-k);
            }
            map.put(PA,map.getOrDefault(PA,0)+1);
        }
        return count;

    }
}