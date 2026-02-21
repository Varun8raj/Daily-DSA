/* Approach : The approach is to just swap first and last character recursively until the base condition is met.*/
// Time Complexity = O(n)
// Space Complexity = O(n) 

package Basics.BasicRecursion;

import java.util.ArrayList;

class Solution {
    public ArrayList<Character> reverseString(ArrayList<Character> s) {
        return StringReversal(s, 0, s.size() - 1);
    }

    private ArrayList<Character> StringReversal(ArrayList<Character> s, int i, int j) {
        if (i > j)
            return s;
        char ch = s.get(i);
        s.set(i, s.get(j));
        s.set(j, ch);
        return StringReversal(s, i + 1, j - 1);
    }
}