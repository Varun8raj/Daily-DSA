/* Approach : We can solve this problem just by using the mapping approach, each character of the string should map to the unique character of the second string, if it is not mapped to the same character as before, then return false.*/
// Time Complexity = O(n)
// Space Complexity = O(k) (k is the constant since the maximum number of characters is 26)

package Basics.BasicStrings;

import java.util.HashMap;

class Solution {
    public boolean isomorphicString(String s, String t) {
        HashMap<Character, Character> hm1 = new HashMap<>();
        HashMap<Character, Character> hm2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (hm1.containsKey(c1)) {
                if (hm1.get(c1) != c2)
                    return false;
            } else
                hm1.put(c1, c2);

            if (hm2.containsKey(c2)) {
                if (hm2.get(c2) != c1)
                    return false;
            } else
                hm2.put(c2, c1);
        }
        return true;
    }
}