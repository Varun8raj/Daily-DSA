/* Approach : We can write a recursive function where we just check if the given number is a sigle digit, if yes then return it else we recursively calculate the sum of the digits until it equals to a single digit.*/
// Time Complexity = O(n)
// Space Complexity = O(n)

package Basics.BasicRecursion;

class Solution {
    public int addDigits(int num) {
        if (num / 10 == 0)
            return num;
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return addDigits(sum);
    }
}