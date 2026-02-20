/* Approach :  The approach is straight forward, first travverse from backward to get the first odd digit index, then traverse from start to get the first non zero digit index, then using the first and last index we can return the largest odd number from the string*/
// Time Complexity = O(2 * n) ~ O(n)
// Space Complexity = O(n) (we return a string of size equal to given string)

package Basics.BasicStrings;

class Solution {
    public String largeOddNum(String s) {
        int first = -1;
        int last = -1;
        int i = s.length() - 1;
        while (i >= 0) {
            if ((s.charAt(i) - '0') % 2 != 0) {
                last = i;
                break;
            }
            i--;
        }
        if (last == -1)
            return "";
        for (int j = 0; j < s.length(); j++) {
            if ((s.charAt(j) - '0') != 0) {
                first = j;
                break;
            }
        }
        return s.substring(first, last + 1);
    }
}