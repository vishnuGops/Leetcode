/*
 * @lc app=leetcode id=821 lang=java
 *
 * [821] Shortest Distance to a Character
 */

// @lc code=start
class Solution {
    public int[] shortestToChar(String s, char c) {
        int len = s.length();
        int[] ans = new int[len];
        int pos = -len;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == c) {
                pos = i;
            }
            ans[i] = i - pos;
        }
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                pos = i;
            }
            ans[i] = Math.min(ans[i], Math.abs(i - pos));
        }
        return ans;
    }
}
// @lc code=end
