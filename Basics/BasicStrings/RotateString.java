/* Approach : First we can double our given string by concatenating with itself, like this we can easily find the rotated array as the rotated array will be in the doubled string as a substring.*/
// Time Complexity = O(n)
// Space Complexity = O(n) 

package Basics.BasicStrings;

class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String doubledS = s + s;
        return doubledS.contains(goal);
    }
}
