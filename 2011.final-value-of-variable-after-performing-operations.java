/*
 * @lc app=leetcode id=2011 lang=java
 *
 * [2011] Final Value of Variable After Performing Operations
 */

// @lc code=start
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n = operations.length;
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (operations[i].equals("--X") || operations[i].equals("X--")) {
                x -= 1;
            } else {
                x += 1;
            }
        }
        return x;
    }
}
// @lc code=end
