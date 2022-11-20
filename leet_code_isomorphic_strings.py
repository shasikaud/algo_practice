from collections import Counter

class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if (len(s) != len(t)):
            return False
        
        dictStoT = {}
        dictTtoS = {}        
        
        for ptr in range(len(s)):
            
            charS = s[ptr]
            charT = t[ptr]
            
            # S -> T
            if charS in dictStoT:
                if (dictStoT[charS] != charT):
                    return False
            else:
                dictStoT[charS] = charT
                
            # T -> S
            if charT in dictTtoS:
                if (dictTtoS[charT] != charS):
                    return False
            else:
                dictTtoS[charT] = charS
                
        return True
                
