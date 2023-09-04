'''
Example 1:
Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.

Example 2:
Input: s = "aba"
Output: false

Example 3:
Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
'''

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for (int i=0; i<s.length()/2; i++){
            int steps = i+1;
            if (s.length()%steps == 0){
                // System.out.println(steps);
                StringBuilder build = new StringBuilder();
                String sub = s.substring(0, steps);
                for (int j=0; j<s.length(); j += steps) {
                    // String sub = s.substring(j, j+steps);
                    // System.out.println(sub);
                    build.append(sub);
                }
                if (build.toString().equals(s)) return true;
            }
        }
        return false;
    }
}