/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {

        int needleLength = needle.length();
        int haystackLength = haystack.length();

        if (needleLength > haystackLength) {
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (i + needleLength <= haystackLength && sameString(haystack.substring(i, i + needleLength), needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean sameString(String hay, String needle) {
        System.out.println(hay);
        return hay.equals(needle);
    }
}
// @lc code=end
