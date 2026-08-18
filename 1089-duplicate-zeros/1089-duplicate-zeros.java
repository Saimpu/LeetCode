class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0){
                int key = arr[i];
                int j=arr.length-2;
                while(j>i){
                    arr[j+1] = arr[j];
                    j--;
                }
                if(i + 1 < arr.length) {
                    arr[i + 1] = 0;
                }
                i++;
            }
        }
    }
}