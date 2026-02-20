/* Approach :  The strategy is using the start pointer and end pointer and then comparing the characters if they are equal, if Yes then continue traversing until the pointers collide, if No then not a palindrome.*/
// Time Complexity = O(n)
// Space Complexity = O(1)

package Basics.BasicStrings;

class Solution {
    public boolean palindromeCheck(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}