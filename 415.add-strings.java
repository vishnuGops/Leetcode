/*
 * @lc app=leetcode id=415 lang=java
 *
 * [415] Add Strings
 */

// @lc code=start
class Solution {
    public String addStrings(String num1, String num2) {
        int l1 = num1.length() - 1;
        int l2 = num2.length() - 1;
        int carry = 0;
        int sum = 0;
        StringBuilder ans = new StringBuilder();

        while (l1 >= 0 || l2 >= 0 || carry > 0) {
            int digit1 = (l1 >= 0) ? Character.getNumericValue(num1.charAt(l1)) : 0;
            int digit2 = (l2 >= 0) ? Character.getNumericValue(num2.charAt(l2)) : 0;

            sum = digit1 + digit2 + carry;
            carry = sum / 10;
            sum = sum % 10;

            ans.insert(0, sum);

            if (l1 >= 0)
                l1--;
            if (l2 >= 0)
                l2--;
        }
        return ans.toString();
    }
}
// @lc code=end
