class Solution {
    public void pattern11(int n) {
        int value;
        for (int i = 1; i <= n; i++) {
            value = i % 2 == 0 ? 0 : 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                value = 1 - value;
            }
            System.out.println();
        }
    }
}