/* Approach : We can find the number of divisors of a number easily, but with that we also need to store them in an array. Then we can just sort the array and return it. */
// Time Complexity = O(sqrt(n) * klogk)
// Space Complexity = O(sqrt(n))

package Basics.BasicMaths;

import java.util.*;

class Solution {
    public int[] divisors(int n) {
        int[] store_array = new int[2 * (int) Math.sqrt(n) + 1];
        int num = n;
        int count = 0;
        for (int i = 1; i <= (int) Math.floor(Math.sqrt(num)); i++) {
            if (num % i == 0) {
                store_array[count++] = i;
                if (i != num / i)
                    store_array[count++] = num / i;
            }

        }
        int divisors[] = Arrays.copyOf(store_array, count);
        Arrays.sort(divisors);
        return divisors;
    }
}