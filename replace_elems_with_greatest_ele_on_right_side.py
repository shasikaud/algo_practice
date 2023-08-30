class Solution(object):
    def replaceElements(self, arr):
        """
        :type arr: List[int]
        :rtype: List[int]
        """
        maxRight = arr[-1]
        ptr = len(arr)-2
        
        while (ptr>=0):
            temp = arr[ptr]
            arr[ptr] = maxRight
            maxRight = max(maxRight, temp)
            ptr -= 1
        
        arr[-1] = -1
        return arr
