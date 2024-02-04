import java.math.BigDecimal;
class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int x=0;
        int secondMinusIndex = s.indexOf('-', s.indexOf('-')+1);
        String[] str={};
        if (secondMinusIndex != -1) {
    str = s.substring(0, secondMinusIndex).split("[^\\-0-9]+");}
        else if (s.startsWith("-") ) {
            str = s.split("[^\\-0-9]+");
        }
        else if(s.startsWith("+")){
            str = s.split("[^\\+0-9]+");
        }
        else{
            str = s.split("[^0-9]+");
        }
        try{
                BigDecimal y = new BigDecimal(str[0]);
                if (y.compareTo(BigDecimal.valueOf(Integer.MIN_VALUE)) < 0  || y.compareTo(BigDecimal.valueOf(Integer.MIN_VALUE)) == 0) {
                return Integer.MIN_VALUE;
            } else if (y.compareTo(BigDecimal.valueOf(Integer.MAX_VALUE)) > 0 || y.compareTo(BigDecimal.valueOf(Integer.MAX_VALUE)) == 0) {
                return Integer.MAX_VALUE;
            } else if (y.compareTo(BigDecimal.valueOf(Integer.MAX_VALUE)) < 0 && 
            y.compareTo(BigDecimal.valueOf(Integer.MIN_VALUE))> 0){
                x = (y.intValue());
            }
                }
            
            catch(Exception e){};
return x;}
}