class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """

        """
        original [1,2,3,4]
        left     [1,1,2,6]
        right    [24,12,4,1]
        product  [24,12,8,6]
        """

        left = [0]*len(nums)
        right = [0]*len(nums)
        product = [0]*len(nums)

        left[0] = 1
        right[-1] = 1

        n = len(nums)

        # left
        cumLeftProduct = 1
        for i in range(1, n):
            cumLeftProduct = cumLeftProduct*nums[i-1]
            left[i] = cumLeftProduct

        # right
        cumRightProduct = 1
        for i in range(n-2, -1, -1):
            cumRightProduct = cumRightProduct*nums[i+1]
            right[i] = cumRightProduct

        for i in range(n):
            product[i] = left[i]*right[i]

        return product
