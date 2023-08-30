class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        maxProfit = 0
        tail = 0
        head = 1
        
        while (head<len(prices)):
            if (prices[head]>prices[tail]):
                maxProfit = max(maxProfit, prices[head]-prices[tail])
            else:
                tail = head
            head += 1
                
        return maxProfit
