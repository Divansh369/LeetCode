class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int[] result=nums.clone();
for (int i=0;i<nums.length-k;i++){
nums[i+k]=result[i];}
int last=nums.length-1;
while (k>0 && last>0){
nums[k-1]=result[last];
k--;
last--;
if (last==0 || k>nums.length){
    break;
}
    }

}}