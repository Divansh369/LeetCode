class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[j]!=nums[i]){
                    nums[count]=nums[j];
                    count++;
                    break;
                }
                break;
        }
        }
        return count;
    }}
