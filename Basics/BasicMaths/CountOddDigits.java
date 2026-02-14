/* Approach : We can get the number of odd digits by getting the last digit each time and checking if it odd, until the number gets to 0 */
// Time Complexity = O(log10(n))
// Space Complexity = O(1)
package Basics.BasicMaths;

class Solution {
    public int countOddDigit(int n) {
        int num = n;
        int count = 0;
        if (num == 0)
            return 0;
        while (num > 0) {
            if ((num % 10) % 2 == 1)
                count++;
            num = num / 10;
        }
        return count;
    }
}