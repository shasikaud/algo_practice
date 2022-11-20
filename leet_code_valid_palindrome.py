import re

class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        
        # ss = re.sub(r'\W+', '', s)
        # ss = ss.lower()
        regex = re.compile('[^a-zA-Z0-9]')
        ss = regex.sub('', s)
        ss = ss.lower()
        # print(ss)
        
        rightPtr = len(ss)-1
        leftPtr = 0
        
        while (leftPtr < rightPtr):
            # print (ss[rightPtr], ss[leftPtr])
            if (ss[rightPtr] != ss[leftPtr]):
                return False
            leftPtr += 1
            rightPtr -= 1
            
        return True
