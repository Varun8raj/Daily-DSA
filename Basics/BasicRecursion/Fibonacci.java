/* Approach : We can calculate the fibonacci of a number just by using the recusrive approach, just by calling the same function recursively until the base condition is satisfied and returned.*/
// Time Complexity = O(2^n)
// Space Complexity = O(n)

package Basics.BasicRecursion;

class Solution {
    public int fib(int n) {
        if (n < 2)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}
