/* Approach : The approach is to just check if there is a number that exists to divide the number recursively until the base condition is met. if any mismatch happens in between then return false. Note: We are checking for divisor of a number with intuition similar to the non-recursive approach problem.*/
// Time Complexity = O(n)
// Space Complexity = O(n)

package Basics.BasicRecursion;

class Solution {
    public boolean checkPrime(int num) {
        if (num == 1)
            return false;
        int sqrtnum = (int) Math.sqrt(num);
        return IsPrime(num, sqrtnum);
    }

    private boolean IsPrime(int num, int sqrtnum) {
        if (sqrtnum <= 1)
            return true;
        if (num % sqrtnum == 0)
            return false;
        return IsPrime(num, sqrtnum - 1);
    }
}