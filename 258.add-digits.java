/*
 * @lc app=leetcode id=258 lang=java
 *
 * [258] Add Digits
 */

// @lc code=start
class Solution {
    public int addDigits(int num) {
        if (num / 10 == 0) {
            return num;
        } else {
            int res = num;
            while (res >= 10) {
                res = findSum(res);
            }
            return res;
        }
    }

    public int findSum(int val) {
        int sum = 0;
        int temp;
        while (val > 0) {
            temp = val % 10;
            sum += temp;
            val = val / 10;
        }
        return sum;
    }
}
// @lc code=end
