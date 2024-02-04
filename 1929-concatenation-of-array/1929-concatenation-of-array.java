class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] n=new int[nums.length*2];
        int count=nums.length;
        for (int i=0;i<nums.length;i++){
            n[i]=nums[i];
            n[count]=nums[i];
            count++;
        }
        return n;
    }
}