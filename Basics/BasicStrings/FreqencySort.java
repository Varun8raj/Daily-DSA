/* Approach : The approach is handle 2 kinds of sorting at the same time, first we handle the characters and sort them according to their frequency count, next if there is a collision then we sort them in ascending order.*/
// Time Complexity = O(n + klogk)
// Space Complexity = O(k) 

package Basics.BasicStrings;

import java.util.List;
import java.util.*;

class Solution {
    public List<Character> frequencySort(String s) {
        Pair[] freq = new Pair[26];
        for (int i = 0; i < 26; i++) {
            freq[i] = new Pair(0, (char) (i + 'a'));
        }

        for (char ch : s.toCharArray()) {
            freq[ch - 'a'].freq++;
        }
        Arrays.sort(freq, (p1, p2) -> {
            if (p1.freq != p2.freq)
                return p2.freq - p1.freq;
            return p1.ch - p2.ch;
        });

        List<Character> result = new ArrayList<>();
        for (Pair p : freq) {
            if (p.freq > 0)
                result.add(p.ch);
        }
        return result;
    }

    class Pair {
        int freq;
        char ch;

        Pair(int f, char c) {
            this.freq = f;
            this.ch = c;
        }
    }
}
