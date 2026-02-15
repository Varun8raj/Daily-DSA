/* Approach : We can get the reverse number by getting the last digit  and multiply by 10 each time, until the given number n gets to 0 */
// Time Complexity = O(log10(n))
// Space Complexity = O(1)

package Basics.BasicMaths;

class Solution {
    public int reverseNumber(int n) {
        int num, lastdigit;
        num = n;
        int revnum = 0;
        if (num == 0)
            return 0;
        while (num > 0) {
            revnum *= 10;
            lastdigit = num % 10;
            revnum += lastdigit;
            num = num / 10;
        }
        return revnum;
    }
}