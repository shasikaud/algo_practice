'''
Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
'''

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
