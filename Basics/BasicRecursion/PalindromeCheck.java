/* Approach : The approach is to just check if first and last character are same recursively until the base condition is met. if any mismatch happens in between then return false*/
// Time Complexity = O(n)
// Space Complexity = O(n)

package Basics.BasicRecursion;

class Solution {
    public boolean palindromeCheck(String s) {
        return IsPalindrome(s, 0, s.length() - 1);
    }

    private boolean IsPalindrome(String s, int i, int j) {
        if (i > j)
            return true;
        if (s.charAt(i) == s.charAt(j))
            return IsPalindrome(s, i + 1, j - 1);
        else
            return false;
    }
}