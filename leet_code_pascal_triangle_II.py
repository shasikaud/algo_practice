class Solution(object):
    def getRow(self, rowIndex):
        """
        :type rowIndex: int
        :rtype: List[int]
        """
        
        # 1
        # 1 1
        # 1 2 1
        # 1 3 3 1
        # 1 4 6 4 1
        
        # 2 -> 1 1
        # 3 -> 1 1
        
         
        row = [1]                              
        
        for i in range(1, rowIndex+1):        #3
            row.append(1)                     #[1 2 1 1] 
            for j in range(i-1, 0, -1):       #1  2  >> 2 1
                row[j] = row[j] + row[j-1]    #[1 2 1 1]
            
        return row
