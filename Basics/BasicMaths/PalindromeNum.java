/* Approach : We can get the reverse number by getting the last digit  and multiply by 10 each time, until the given number n gets to 0. Then at last we can just compare if reverse number is equal to the given number.*/
// Time Complexity = O(log10(n))
// Space Complexity = O(1)

package Basics.BasicMaths;

class Solution {
    public boolean isPalindrome(int n) {
        int num = n;
        int revnum = 0;
        if (num == 0)
            return true;
        while (num > 0) {
            revnum = (revnum * 10) + num % 10;
            num /= 10;
        }
        if (revnum == n)
            return true;
        return false;
    }
}
