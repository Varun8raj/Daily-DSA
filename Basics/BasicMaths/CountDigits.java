/* Approach : We can get the number of digits by reducing the number/10 each time, until the number gets to 0 */
// Time Complexity = O(log10(n))
// Space Complexity = O(1)

class Solution {
    public int countDigit(int n) {
        int num = n;
        int count = 0;
        if (num == 0)
            return 1;
        while (num > 0) {
            num = num / 10;
            count = count + 1;
        }
        return count;
    }
}