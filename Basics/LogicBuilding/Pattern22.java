class Solution {
    public void pattern22(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                int top, bottom, left, right;
                top = i - 1;
                bottom = 2 * n - 1 - i;
                left = j - 1;
                right = 2 * n - 1 - j;
                System.out.print(n - Math.min(Math.min(left, right), Math.min(top, bottom)) + " ");
            }
            System.out.println();
        }

    }
}