class Solution {
    public int sumOfUnique(int[] nums) {
        int flag=0,sum=0;
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
                if (i!=j){
                if (nums[j]==nums[i]){
                    flag=1;
                    break;}
                    else{
                        flag=0;
                    }
            }}
            if (flag==0){
                sum+=nums[i];
            }
        }
        return sum;
    }
}