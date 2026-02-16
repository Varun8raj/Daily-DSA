/* Approach : We can get the largest digit of the number by getting the last digit each time and comparing if it is the largest digit so far, until the given number n gets to 0.*/
// Time Complexity = O(log10(n))
// Space Complexity = O(1)

package Basics.BasicMaths;

class Solution {
    public int largestDigit(int n) {
        int num = n;
        int lardigit = 0;
        if (num == 0)
            return 0;
        while (num > 0) {
            lardigit = lardigit > num % 10 ? lardigit : num % 10;
            num = num / 10;
        }
        return lardigit;
    }
}