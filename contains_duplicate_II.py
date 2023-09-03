'''
Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true

Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
'''

class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        
        dictN = {}
        
        for ptr in range(len(nums)):
            currNum = nums[ptr]
            if currNum in dictN:
                diff = abs(dictN[currNum] - ptr)
                if (diff <= k):
                    return True
                dictN[currNum] = ptr
            else:
                dictN[currNum] = ptr
                
        return False
    

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();

        for (int i=0; i<nums.length; i++){
            int curr = nums[i];
            if (map.containsKey(curr)) {
                int prevIndex = map.get(curr);
                if (i-prevIndex <= k) return true;
            }
            map.put(curr, i);
        }

        return false;
    }
}
        
