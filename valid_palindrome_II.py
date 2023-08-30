def isPalindrome(leftPtr, rightPtr, s):
    while (leftPtr < rightPtr):
        if (s[rightPtr] != s[leftPtr]):
            return False
        leftPtr += 1
        rightPtr -= 1 
    return True
    
class Solution(object):  
    def validPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        leftPtr = 0
        rightPtr = len(s)-1
        
        while (leftPtr < rightPtr):
            if (s[rightPtr] != s[leftPtr]):
                result1 = isPalindrome(leftPtr, rightPtr-1, s)
                result2 = isPalindrome(leftPtr+1, rightPtr, s)
                return (result1 or result2)
            else:
                leftPtr += 1
                rightPtr -= 1
                
        return True
