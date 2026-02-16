/* Approach : We can get the factorial of a given number just by multiplying the value and also reducing it by 1 each time, until the given number n gets to 0.*/
// Time Complexity = O(n)
// Space Complexity = O(1)

package Basics.BasicMaths;

class Solution {
    public int factorial(int n) {
        int num = n;
        long fact = 1;
        if (num == 0)
            return 1;
        while (num > 0) {
            fact = fact * num;
            num--;
        }
        return (int) fact;
    }
}
