class Solution {
    public void pattern14(int n) {
        int value;
        for (int i = 1; i <= n; i++) {
            value = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print((char) value);
                value++;
            }
            System.out.println();
        }
    }
}