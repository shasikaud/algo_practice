class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] outputArr = new int[2];
        
        for (int i=0 ; i<nums.length ; i++) {
            // System.out.println(nums[i]);
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                outputArr[0] = i;
                outputArr[1] = map.get(diff);
                return outputArr;
            }
            map.put(nums[i], i);
        }
        return outputArr;
    }
}
