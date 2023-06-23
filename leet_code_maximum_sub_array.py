#brute force 2 ptr strategy
class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        maxSum = -10000 # -INT.MAX
        rightPtr = 0
        leftPtr = 0
        tempSum = 0
        while (leftPtr<len(nums)):
            tempSum += nums[rightPtr]
            maxSum = max(maxSum, tempSum)
            rightPtr += 1
            if (rightPtr == len(nums)):
                tempSum = 0
                rightPtr = leftPtr+1
                leftPtr = rightPtr
        return maxSum
