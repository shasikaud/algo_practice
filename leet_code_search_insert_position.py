class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        lowerBound = 0
        upperBound = len(nums)-1
        ans = 0
        
        while (lowerBound <= upperBound):
            midPoint = int((lowerBound+upperBound)/2)
            value = nums[midPoint]
            if (value == target):
                return midPoint
            elif (value<target):
                lowerBound = midPoint + 1
            else:
                upperBound = midPoint - 1
            ans = midPoint
                
        return upperBound+1
            
            
