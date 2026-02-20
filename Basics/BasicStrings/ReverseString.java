/* Approach :  The approach to solve this problem is simple, we can just take 2 pointers one  at start and one at end, and then just swap them until the start pointer collides with the end pointer (this indicates that all the characters are already swapped). We finally get the reverse of the string in an array of characters form*/
// Time Complexity = O(n)
// Space Complexity = O(1)

package Basics.BasicStrings;

import java.util.List;

class Solution {
    public void reverseString(List<Character> s) {
        int i = 0;
        int j = s.size() - 1;
        char ch;
        while (i < j) {
            ch = (char) s.get(i);
            s.set(i, s.get(j));
            s.set(j, ch);
            i++;
            j--;
        }
    }
}
