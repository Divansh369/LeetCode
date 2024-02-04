class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            n=-n;
            x=1/x;
        }
        if(n==0){
            return 1;
        }
        
        double rec=1;
        while(n!=0){
            if((n&1)==1){
                rec=rec*x;
            }
            x*=x;
            n=n>>>1;
        }
        return rec;
        

        
    }
}