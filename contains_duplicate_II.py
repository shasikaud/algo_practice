class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        
        dictN = {}
        
        for ptr in range(len(nums)):
            currNum = nums[ptr]
            if currNum in dictN:
                diff = abs(dictN[currNum] - ptr)
                if (diff <= k):
                    return True
                dictN[currNum] = ptr
            else:
                dictN[currNum] = ptr
                
        return False
        
