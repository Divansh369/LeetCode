class Solution {
    public int firstMissingPositive(int[] nums) {
        int miss=1;
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            if (nums[i]==miss && nums[i]>0){
                    miss++;
            }
        }
        return miss;
    }
}