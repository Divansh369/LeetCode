class Solution(object):
    def findMedianSortedArrays(self,nums1, nums2):
        nums = sorted(nums1 + nums2)
        nums=sorted(nums)
        n = len(nums)

        if (n%2==0):
            return ( nums[(n // 2) - 1]+nums[n // 2])/2 
        elif (n%2==1):
            return nums[n // 2]