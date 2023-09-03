'''
Example 1:
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.

Example 2:
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
'''

class Solution {
    public int strStr(String haystack, String needle) {
        for (int i=0; i<=haystack.length()-needle.length(); i++){
            // System.out.println(haystack.charAt(i));
            if (haystack.charAt(i) == needle.charAt(0)){
                // System.out.println(haystack.charAt(i));
                String sub = haystack.substring(i, i+needle.length());
                // System.out.println(sub);
                if (sub.equals(needle)) return i;
            }
        }
        return -1;
    }
}