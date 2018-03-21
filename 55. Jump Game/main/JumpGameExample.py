class Solution:
    def canJump(nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        # the number of the list that can be max reach
        reachable = 0
        for i in range(len(nums)):
            if i > reachable:
                return False
            # mean the current element go to VS the reachable
            reachable = max(reachable, i + nums[i])
        return True
