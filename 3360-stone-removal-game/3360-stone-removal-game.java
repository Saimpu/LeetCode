class Solution {
    public boolean canAliceWin(int n) {
        int d = 10;
        int i=0;
        // if(n == 10){
        //     return true;
        // }else if(n<10){
        //     return false;
        // }
        while(n>=d){
            if(n>=d){
                n= n-d;
                d--;
            }
            if(i == 0){
                i = 1;
            }else{
                i = 0;
            } 
        }
        return (i==1)?true:false;
    }
}