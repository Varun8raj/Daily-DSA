/* Approach : The approach for this problem is to find the pattern of first transposing the give matrix and then reversing each row of that transposed matrix to get the desired rotated matrix So, first it takes n^2 to rotate the matrix and n^2 to reverse each row of that matrix. */
// Time Complexity = O(n^2)
// Space Complexity = O(1)

package Advanced.Arrays.FAQS_medium;

class Solution {
    public void rotateMatrix(int[][] matrix) {
        int temp;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
}
