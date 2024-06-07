/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int len = s.length();
        int sum = 0;
        int i = 0;
        while (i < len) {
            char roman = s.charAt(i);
            int val = map.get(roman);
            if (i + 1 < len && map.get(s.charAt(i + 1)) > val) {
                sum -= val;
                i++;
            } else {
                sum += val;
                i++;
            }
        }
        return sum;
    }
}
// @lc code=end
