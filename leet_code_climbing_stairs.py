class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        if (n<=3):
            return n
        
        a = 3
        b = 2
        
        #fibonacci
        while (n-3>0):
            a = a + b
            b = a - b
            n -= 1
            
        return a
