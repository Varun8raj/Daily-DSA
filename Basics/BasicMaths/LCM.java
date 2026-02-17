/* Approach : We can use the Euclidean Algorithm to get the GCD for this problem, since GCD(a,b) = GCD(a-b,b) if a>b. And next we can use the relation between LCM and GCD to find the LCM once we get the GCD.
LCM(a,b) * GCD(a,b) = (a * b). */
// Time Complexity = O(log(min(n1,n2)))
// Space Complexity = O(1)

package Basics.BasicMaths;

class Solution {
    public int LCM(int n1, int n2) {
        int num1, num2, mul, gcd;
        num1 = n1;
        num2 = n2;
        mul = num1 * num2;
        while (num1 > 0 && num2 > 0) {
            if (num1 > num2)
                num1 = num1 % num2;
            else
                num2 = num2 % num1;
        }
        gcd = num1 == 0 ? num2 : num1;
        return mul / gcd;
    }
}