/* Approach : Since we need to find a divisor first, if there is exists a divisor then it is not a prime, the logic is we don't need to check from 1 to n for all the divisors. We can reduce the number of iterations to sqrt(n) as if a divides n then b which is equal to n/a also divides n (i.e; a*b = n), like this we can check if a number is prime or not between the iterations 2 -> sqrt(n) as 1 is obviously a divisor.*/
// Time Complexity = O(sqrt(n))
// Space Complexity = O(1)
package Basics.BasicMaths;

class Solution {
    public boolean isPrime(int n) {
        if (n == 1)
            return false;
        int num = n;
        int sqroot = (int) (Math.floor(Math.sqrt(num)));
        for (int i = 2; i <= sqroot; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}