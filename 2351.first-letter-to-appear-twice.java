/*
 * @lc app=leetcode id=2351 lang=java
 *
 * [2351] First Letter to Appear Twice
 */

// @lc code=start

class Solution {
    public char repeatedCharacter(String s) {
        ArrayList<Character> list = new ArrayList<>();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            if (list.contains(s.charAt(i))) {
                val = i;
                break;
            } else {
                list.add(s.charAt(i));
            }
        }
        return s.charAt(val);
    }
}
// @lc code=end
