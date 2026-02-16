/* Approach : Since we need to find all the divisors first, the logic is we don't need to check from 1 to n for all the divisors. We can reduce the number of iterations to sqrt(n) as if a divides n then b which is equal to n/a also divides n (i.e; a*b = n), like this we can get our all divisors of a number between the iterations 2 -> sqrt(n) as 1 is obviously a divisor.*/
// Time Complexity = O(sqrt(n))
// Space Complexity = O(1)

package Basics.BasicMaths;

class Solution {
    public boolean isPerfect(int n) {
        int num = n;
        int sum = 1;
        if (num == 1)
            return false;
        int squareroot = (int) Math.floor(Math.sqrt(num));
        for (int i = 2; i <= squareroot; i++) {
            if (num % i == 0)
                sum = sum + i + (num / i);
        }
        if (sum == num)
            return true;
        return false;

    }
}
