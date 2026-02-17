/* Approach : Since we need to find the number of prime numbers between 1 to n for each number, if there exists a divisor then it is not a prime, the logic is we don't need to check from 1 to n for all the divisors. We can reduce the number of iterations to sqrt(n) as if a divides n then b which is equal to n/a also divides n (i.e; a*b = n), like this we can check if a number is prime or not between the iterations 2 -> sqrt(n) as 1 is obviously a divisor. So we can get the total count of prime numbers from the outer loop.*/
// Time Complexity = O(n^3/2)
// Space Complexity = O(1)
package Basics.BasicMaths;

class Solution {
    public int primeUptoN(int n) {
        int num = n;
        int count = 0;
        boolean flag = false;
        for (int i = 2; i <= num; i++) {
            int sqaureroot = (int) Math.floor(Math.sqrt(i));
            flag = true;
            for (int j = 2; j <= sqaureroot; j++) {
                if (i % j == 0)
                    flag = false;
            }
            if (flag)
                count++;
        }
        return count;
    }
}