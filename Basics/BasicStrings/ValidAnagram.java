/* Approach : Inorder to check for anagram strings, I used two hashmaps, where each stores the frequency count of the character, and then check if the frequency is equal or not. If yes then it is an anagram.*/
// Time Complexity = O(n)
// Space Complexity = O(2 * n) 

package Basics.BasicStrings;

import java.util.HashMap;

class Solution {
    public boolean anagramStrings(String s, String t) {
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            hm1.put(s.charAt(i), hm1.getOrDefault(s.charAt(i), 0) + 1);
            hm2.put(t.charAt(i), hm2.getOrDefault(t.charAt(i), 0) + 1);
        }
        for (char c : hm1.keySet()) {
            if (!hm1.get(c).equals(hm2.getOrDefault(c, 0))) {
                return false;
            }
        }
        return true;
    }
}