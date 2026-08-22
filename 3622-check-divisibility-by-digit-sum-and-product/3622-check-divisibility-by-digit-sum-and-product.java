class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0 ;
        int or = n;
        int prod = 1;
        while(or>0){
            int rem = or%10;
            sum+=rem;
            prod*=rem;
            or = or/10;
        }
        if(n%(sum+prod)==0){
            return true;
        }
        return false;
    }
}