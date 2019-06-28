package com.aditya.files.medium;

/*Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
*
Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
*
* */

public class LongestPalindromicSubstring_5 {
    public static String longestPalindrome(String s) {
        int n = s.length();
        String res = null;

        boolean[][] dp = new boolean[n][n];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                dp[i][j] = (s.charAt(i) == s.charAt(j)) && (j - i < 3 || dp[i + 1][j - 1]);
                if (dp[i][j] && (res == null || j - i + 1 > res.length())) {
                    res = s.substring(i, j + 1);
                }
            }
        }

        return res;
    }


}