class Solution {
    public int findComplement(int num) {
        StringBuilder sb = new StringBuilder();
        while(num>0){
            sb.insert(0,num%2);
            num = num/2;
        }
        String str = sb.reverse().toString();
        int base = 1;
        int decimal = 0;
        for(int i = 0;i<str.length();i++){
            decimal+= ((str.charAt(i)-'0')^1)*base;
            base *=2;
        }
        return decimal;
    }
}