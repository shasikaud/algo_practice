class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if (x<0):
            return False
        
        conv = str(x)
        if (len(conv) == 1):
            return True
        
        leftPtr = 0
        rightPtr = len(conv)-1
        
        while (True):
            #print (leftPtr, rightPtr)
            if (leftPtr > rightPtr):
                return True
            if (conv[leftPtr] != conv[rightPtr]):
                return False
            leftPtr += 1
            rightPtr -= 1
