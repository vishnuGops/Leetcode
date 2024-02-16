/*
 * @lc app=leetcode id=414 lang=java
 *
 * [414] Third Maximum Number
 */

// @lc code=start
class Solution {
    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for (Integer n : nums) {
            if (n > max3 && n != max2 && n != max1) {
                if (n >= max2) {
                    if (n >= max1) {
                        max3 = max2;
                        max2 = max1;
                        max1 = n;
                        continue;
                    }
                    max3 = max2;
                    max2 = n;
                    continue;
                }
                if (n > max3) {
                    max3 = n;
                }
            }
        }
        return max3 == Long.MIN_VALUE ? (int) max1 : (int) max3;
    }
}
// @lc code=end
