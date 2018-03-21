class Solution:
    def canJump(nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        if len(nums) == 1:
            return True
        if nums[0] == 0:
            return False
        left = 0
        right = len(nums) - 1

        while left < right:
            # the index has much bigger number
            if nums[left] > right:
                print(True)
                return True

            # handle the element is 0
            if nums[left] == 0:
                redo_left = left
                # for re-find the bigger number to pass 0 element
                for redo_left in range(left, -1, -1):
                    if nums[redo_left] + redo_left > left:
                        left = nums[redo_left] + redo_left
                        break
                if left >= right:
                    return True

                # handle the element is zero with reverse loop
                reverse_left = left
                for reverse_left in range(left, -1, -1):
                    #print("reverse")
                    if reverse_left > 0 and nums[reverse_left-1] == nums[reverse_left]+1:
                        if reverse_left == 0 and nums[reverse_left] + reverse_left == left:
                            print(False)
                            return False
                    elif reverse_left == 0 and nums[reverse_left+1] == nums[reverse_left] - 1 \
                            and nums[reverse_left] + reverse_left == left:
                        print(False)
                        return False
            elif nums[left] > 0:
                # add the left pointer
                left = nums[left] + left

            if left >= right:
                return True

            #for checking there are enoutgh element to pass the 0
            if nums[left] == 0:
                #print("here")
                i = 0
                for i in range(0, left+1):
                    print(i)
                    print("left"+left.__str__())
                    if i == left:
                        print(False)
                        return False
                    if i + nums[i] > left:
                        break
                    i += 1

