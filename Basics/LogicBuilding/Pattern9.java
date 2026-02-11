class Solution {
    public void pattern9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++)
                System.out.print(" ");
            for (int j = 1; j <= (2 * n - (2 * i - 1)); j++)
                System.out.print("*");
            System.out.println();
        }
    }
}