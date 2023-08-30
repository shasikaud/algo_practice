class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        mapper = {
            "I":1,
            "II":2,
            "III":3,
            "IV":4,
            "V":5,
            "IX":9,
            "X":10,
            "XL":40,
            "L":50,
            "XC":90,
            "C": 100,
            "CD":400,
            "D":500,
            "CM":900,
            "M":1000
                 }
        
        ptr = 0
        window = 1
        counter = 0
        
        while (ptr+window<=len(s)):
            subStr = s[ptr:ptr+window]
            print(subStr)
            if subStr in mapper:
                window += 1
            else:
                key = s[ptr:ptr+window-1]
                counter += mapper[key]   
                # print(counter)
                ptr += len(key)
                window = 1
        
        counter += mapper[s[ptr:ptr+window-1]]
        return counter

                
            
        
