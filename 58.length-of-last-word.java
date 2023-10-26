/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        int wordLen = 0;
        for (int i = len - 1; i >= 0; i--) {
            if ((s.charAt(i) == ' ') && wordLen == 0) {
                continue;
            } else if ((s.charAt(i) == ' ') && wordLen > 0) {
                break;
            } else {
                wordLen++;
            }
        }
        return wordLen;
    }
}
// @lc code=end
