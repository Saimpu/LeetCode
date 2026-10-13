class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] newarr=new Integer[arr.length];
        for(int i =0;i<arr.length;i++){
            newarr[i]=arr[i];
        }
        Arrays.sort(newarr, (a,b)->{
            int a_count=Integer.bitCount(a);
            int b_count=Integer.bitCount(b);
            if(a_count!=b_count){
                return a_count-b_count;
            }
            return a-b;
        });
        for(int i =0;i<arr.length;i++){
            arr[i]=newarr[i];
        }
        return arr;
    }
}