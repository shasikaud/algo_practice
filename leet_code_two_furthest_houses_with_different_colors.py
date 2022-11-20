class Solution(object):
    def maxDistance(self, colors):
        """
        :type colors: List[int]
        :rtype: int
        """
        head = 0
        tail = 0
        maxDist = 0
        
        while (tail<len(colors)):
            
            if (head>=len(colors)):
                tail += 1
                head = tail
                continue
                
            if (colors[head] != colors[tail]):
                maxDist = max(maxDist, head-tail)
                
            head += 1
        
        return maxDist
        
