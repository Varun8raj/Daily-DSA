/* Approach : We can solve this problem by using finding the pattern from the problem pascal's triangle I. Since at rth row, each element i apart from the first element as it is 1 is calculated by multiplying with the previous element and then multiplying with (r-i)/i */
// Time Complexity = O(r)
// Space Complexity = O(r)

package Advanced.Arrays.FAQS_medium;

class Solution {
    public int[] pascalTriangleII(int r) {
        int[] ans = new int[r];
        ans[0] = 1;
        for (int i = 1; i < r; i++) {
            ans[i] = (ans[i - 1] * (r - i)) / i;
        }
        return ans;
    }
}
