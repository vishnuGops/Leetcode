/*
 * @lc app=leetcode id=290 lang=java
 *
 * [290] Word Pattern
 */

// @lc code=start

import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            String currentWord = words[i];
            char currentChar = pattern.charAt(i);

            if (map.containsKey(currentChar)) {
                if (!map.get(currentChar).equals(currentWord)) {
                    return false;
                }
            } else {
                if (map.containsValue(currentWord)) {
                    return false;
                }
                map.put(currentChar, currentWord);
            }
        }
        return true;
    }
}
// @lc code=end
