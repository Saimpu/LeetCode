/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> li = new ArrayList<>();
         ListNode temp = head;
         while(temp !=null){
            li.add(temp.val);
            temp = temp.next;
         }
         Stack<Integer> st = new Stack<>();
         int[] a = new int[li.size()];
         for(int i = li.size()-1;i>=0;i--){
            int num = li.get(i);
            while(!st.isEmpty() && num >= st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                a[i] = 0;
            }else{
                a[i] = st.peek();
            }
            st.push(num);
         }
         return a;
    }
}