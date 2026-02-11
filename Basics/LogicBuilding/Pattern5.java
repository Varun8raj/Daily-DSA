class Solution {
    public void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i + 1; j >= 1; j--)
                System.out.print("*");
            System.out.println();
        }
    }
}