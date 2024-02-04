class Solution {
    public int divide(int dividend, int divisor) {
        int x=dividend/divisor;
        if (x<=Integer.MIN_VALUE && divisor<0){
            return Integer.MAX_VALUE;
        }
        else if (x<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }else if (x>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        return x;
    }
}