class Solution {
    public String longestPalindrome(String s) {
        String maxLen = "";
        for (int i = 0; i < s.length(); i++){
            String str1 = cal(s, i, i+1);
            String str2 = cal(s, i, i);
            if (str1.length() > maxLen.length()){
                maxLen = str1;
            }
            if (str2.length() > maxLen.length()){
                maxLen = str2;
            }
        }
        return maxLen;
                
    }
    
    public String cal(String s, int left, int right){
        String sub = "";
        while (left >= 0 && right <= s.length()-1){
            if (s.charAt(left) == s.charAt(right)) {
                sub = s.substring(left, right+1);
                left -= 1;
                right += 1;
            } else {
                return sub;
            }
        }
        return sub;
    }
}
