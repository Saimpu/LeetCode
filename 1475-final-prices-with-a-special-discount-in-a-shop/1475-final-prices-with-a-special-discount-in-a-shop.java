class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int result[] = new int[prices.length];
        result[prices.length-1] = prices[prices.length-1];
        st.push(prices[prices.length-1]);
        for(int i = prices.length-2;i>=0;i--){
            int num = prices[i];
            while(!st.isEmpty() && num < st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                result[i] = num;
            }else{
                result[i] = num - st.peek();
            }
            st.push(num);
        }
        return result;
    }
}