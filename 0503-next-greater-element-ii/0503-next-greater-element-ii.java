class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        List<Integer> li = new ArrayList<>();
        int[] res = new int[2*nums.length];
        int[] result = new int[nums.length];
        for(int i = 0;i<2;i++){
            for(int num : nums){
                li.add(num);
            }
        }
        int n = nums.length;
        res[2*n-1] = -1; 
        st.push(nums[nums.length-1]);
        for(int i = li.size()-2;i>=0;i--){
            int num = li.get(i);
            while(!st.isEmpty() && num >= st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
               res[i] = -1;
            }else{
                res[i] = st.peek();
            }
            st.push(num);
        }
        for(int i = 0;i<nums.length;i++){
            result[i] = res[i];
        }
        return result;
    }
}