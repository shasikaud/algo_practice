class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        mainList = [[1]]
        
        for i in range(2, numRows+1):
            row = []
            
            prev = mainList[-1]
            row.append(prev[0])
            
            
            for j in range(i-2):
                temp = prev[j] + prev[j+1]  
                row.append(temp)
                
            
            row.append(prev[-1])
            mainList.append(row)
            
        return mainList
        
