class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
    
        length = 0
        ptr = len(s)-1
        
        while(ptr>=0):
            
            if (s[ptr] == ' ' and length == 0):
                ptr -= 1
                continue
            if (s[ptr] == ' ' and length > 0):
                return length
            
            ptr -=1
            length += 1
                
        return length
