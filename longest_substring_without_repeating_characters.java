class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0 || n == 1) return n;
        Set<String> set = new HashSet<String>();
        int maxLen = 0;
        int currMax = 0;
        int tail = 0;
        int head = 0;
        while (tail != n){
            String curr = String.valueOf(s.charAt(tail));
            if (set.contains(curr)) {
                set.clear();
                head += 1;
                tail = head;
                if (currMax > maxLen) {
                    maxLen = currMax;
                }
                currMax = 0;
            } else {
                set.add(curr);
                currMax += 1;
                tail += 1;
            }
        }
        return Math.max(maxLen, currMax);
    }
}
