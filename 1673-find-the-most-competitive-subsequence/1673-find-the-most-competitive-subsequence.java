class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> st = new Stack<>();
        int[] a = new int[k];
        for(int i = 0;i<nums.length;i++){
            int num = nums[i];

            while(!st.isEmpty() && st.peek() > num && nums.length-i+st.size()>k){
                st.pop();
            }

            if(st.size()<k){
                st.push(num);
            }
        }
        for(int i = 0;i<k;i++){
            a[i] = st.get(i);
        }
        return a;

    }
}