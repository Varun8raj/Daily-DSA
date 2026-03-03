/* Approach : We can solve this problem by using finding the pattern from the problem pascal's triangle II. We just need to calculate the pascal row for each value from 1 to n and then return the whole. */
// Time Complexity = O(r^2)
// Space Complexity = O(r^2)

package Advanced.Arrays.FAQS_medium;

import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<List<Integer>> pascalTriangleIII(int n) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        for (int row = 1; row <= n; row++) {
            pascalTriangle.add(generateRow(row));
        }
        return pascalTriangle;
    }

    private List<Integer> generateRow(int row) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for (int col = 1; col < row; col++) {
            ans = (ans * (row - col)) / col;
            ansRow.add((int) ans);
        }
        return ansRow;
    }
}
