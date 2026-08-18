class Solution {
    public void duplicateZeros(int[] arr) {
        int[] ar = new int[arr.length];
        int j = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (j >= ar.length) {
                break;
            }
            
            if (arr[i] == 0) {
                ar[j] = 0; 
                j++;
                
                if (j < ar.length) {
                    ar[j] = 0;
                    j++;
                }
            } else {
                ar[j] = arr[i];
                j++;
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ar[i];
        }
    }
}