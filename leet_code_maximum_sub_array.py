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


class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        """
        [-2,1,-3,4,-1,2,1,-5,4]
        """
        
        maxSum = nums[0]
        tempSum = 0

        for i in nums:
            if tempSum<0:
                tempSum = 0
            tempSum += i
            maxSum = max(maxSum, tempSum)

        return maxSum
