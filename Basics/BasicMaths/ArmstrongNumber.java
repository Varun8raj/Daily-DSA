/* Approach : The approach is simple, first get the number of digits by the formula log10(N), then we just need to loop to get the last digit and then raise it to the power of number of digits and then add it to the sum.We continue this till the given number comes to 0 (that means number of digits is also 0). We now just compare to know if it is an amstrong number or not*/
// Time Complexity = O(log10(n))
// Space Complexity = O(1)

package Basics.BasicMaths;

class Solution {
    public boolean isArmstrong(int n) {
        int num = n;
        int sumdigitpower = 0;
        if (num == 0)
            return true;
        int numofdigits = (int) Math.floor(Math.log10(num) + 1);
        while (num > 0) {
            sumdigitpower = sumdigitpower + (int) Math.pow(num % 10, numofdigits);
            num /= 10;
        }
        if (sumdigitpower == n)
            return true;
        return false;
    }
}