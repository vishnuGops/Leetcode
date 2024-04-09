/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        long r = 0;
        int y = x;
        while (y > 0) {
            r = r * 10 + y % 10;
            y = y / 10;
        }
        return r == x;
    }
}
// @lc code=end
