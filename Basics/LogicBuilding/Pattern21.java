class Solution {
    public void pattern21(int n) {
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++)
                    System.out.print("*");
                System.out.println();
            } else {
                System.out.print("*");
                for (int j = 1; j <= n - 2; j++)
                    System.out.print(" ");
                System.out.print("*");
                System.out.println();
            }
        }
    }
}