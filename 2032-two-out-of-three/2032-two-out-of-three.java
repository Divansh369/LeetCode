class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> x=new ArrayList<Integer>();
        for (int a=0;a<nums1.length;a++){
            for (int b=0;b<nums2.length;b++){
                if (nums1[a]==nums2[b] && !x.contains(nums2[b])){
                    x.add(nums2[b]);
                    break;
                }
            }
        }
        for (int a=0;a<nums1.length;a++){
            for (int b=0;b<nums3.length;b++){
                if (nums1[a]==nums3[b] && !x.contains(nums3[b])){
                    x.add(nums3[b]);
                    break;
                }
            }
        }
        for (int a=0;a<nums3.length;a++){
            for (int b=0;b<nums2.length;b++){
                if (nums3[a]==nums2[b] && !x.contains(nums2[b])){
                    x.add(nums2[b]);
                    break;
                }
            }
        }
    return x;
    }
}