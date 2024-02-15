/*
 * @lc app=leetcode id=2129 lang=java
 *
 * [2129] Capitalize the Title
 */

// @lc code=start
class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder newTitle = new StringBuilder();
        String[] words = title.split(" ");

        for (String s : words) {
            if (s.length() <= 2) {
                newTitle.append(s.toLowerCase() + " ");
            } else {
                newTitle.append(s.substring(0, 1).toUpperCase());
                newTitle.append(s.substring(1).toLowerCase() + " ");
            }
        }
        return newTitle.toString().trim();
    }
}
// @lc code=end
