class Solution(object):
    def getCommon(self, nums1, nums2):
        return min(set(nums1) & set(nums2)) if len(set(nums1) & set(nums2)) else -1