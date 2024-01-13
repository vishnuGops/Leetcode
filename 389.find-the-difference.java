/*
 * @lc app=leetcode id=389 lang=java
 *
 * [389] Find the Difference
 */

// @lc code=start

import java.util.Map;

class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        char temp = ' ';
        // fill the map with string s characters
        for (int i = 0; i < s.length(); i++) {
            temp = s.charAt(i);
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }

        // check the map for extra char
        for (int i = 0; i < t.length(); i++) {
            temp = t.charAt(i);
            if (map.containsKey(temp) && map.get(temp) > 0) {
                map.put(temp, map.get(temp) - 1);
            } else {
                break;
            }
        }
        return temp;
    }
}
// @lc code=end
