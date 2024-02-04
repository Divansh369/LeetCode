class Solution {
    public String defangIPaddr(String address) {
        // return address.replaceAll("\\.", "[.]");
        String x="";
        for (int i=0;i<address.length();i++){
            if (address.charAt(i)=='.'){
                x += "[.]";
            }
            else{
                x+=address.charAt(i);
            }
        }
        return x;
    }
}