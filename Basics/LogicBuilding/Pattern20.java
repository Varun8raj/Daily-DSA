class Solution {
    public void pattern20(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= (n - i); j++)
                System.out.print("*");
            for (int j = 1; j <= 2 * i; j++)
                System.out.print(" ");
            for (int j = 1; j <= (n - i); j++)
                System.out.print("*");
            System.out.println();
        }
    }
}