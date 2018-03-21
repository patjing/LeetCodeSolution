import math


class Solution:
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        nums = nums1 + nums2
        nums = sorted(nums)
        if len(nums) % 2 == 0:
            divide = nums[round(len(nums)/2)] + nums[round(len(nums)/2) - 1]
            return divide / 2
        else:
            return float(nums[math.floor(len(nums)/2)])
