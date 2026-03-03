/* Approach : The approach to solve this problem is using the formula for nCr, since the number at rth row and cth col is calculated using (r-1)C(c-1). */
// Time Complexity = O(col)
// Space Complexity = O(1)

package Advanced.Arrays.FAQS_medium;

class Solution {
    public int pascalTriangleI(int r, int c) {
        return combination(r - 1, c - 1);
    }

    private int combination(int n, int r) {
        int result = 1;
        if (r == 1)
            return n;
        if (r > n - r)
            r = n - r;
        for (int i = 0; i < r; i++) {
            result = result * (n - i);
            result = result / (i + 1);
        }
        return result;
    }
}
