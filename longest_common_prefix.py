class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if (len(strs) == 1):
            return strs[0]
        
        longestPre = ""
        ptr = 0
        key = strs[0]
        
        while (True):
            
            if (ptr>len(key)-1):
                return longestPre
            currChar = key[ptr]
            
            for i in range(1, len(strs)):
                currWord = strs[i]
                if (ptr>len(currWord)-1):
                    return longestPre
                if (currWord[ptr] != currChar):
                    return longestPre
                
            longestPre += currChar
            ptr += 1
                
                
                
        return longestPre
