class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int val =0,max=0;
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)>val){
                val = map.get(i);
                max = i;
                // max = Math.max(max,map.get);
            }
        }
        return max;
    }
}