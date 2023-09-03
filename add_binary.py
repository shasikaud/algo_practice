'''
Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
'''

class Solution(object):
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        maxLen = max(len(a), len(b))
        a = a.zfill(maxLen)
        b = b.zfill(maxLen)

        carry = 0
        ptr = maxLen - 1
        tot = ""
        
        while (ptr>=0):
            summation = int(a[ptr])+int(b[ptr])+carry
            if (summation == 2):
                tot = '0'+tot
                carry = 1
            elif (summation == 3):
                tot = '1'+tot
                carry = 1
            else:
                carry = 0
                tot = str(summation)+tot
            ptr -= 1
                
        if (carry == 1):
            return '1'+tot
        return tot
