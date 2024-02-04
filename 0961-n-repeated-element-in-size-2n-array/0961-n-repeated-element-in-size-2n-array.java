class Solution {
    public int repeatedNTimes(int[] nums) {
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[j]==nums[i]){
                    return nums[j];
                }
            }
        }
        return 0;
    }
}