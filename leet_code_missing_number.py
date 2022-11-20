class Solution(object):
#     def missingNumber(self, nums):
#         """
#         :type nums: List[int]
#         :rtype: int
#         """
#         nums.sort()
        
#         for i in range(len(nums)):
#             if (i != nums[i]):
#                 return i
            
#         return len(nums)
        
    #XOR everything >> dups will vanish
    
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        xor = len(nums)
        for i in range(len(nums)):
            xor = xor^i
            xor = xor^nums[i]
            
        return xor
