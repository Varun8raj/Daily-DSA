class Solution {
    public void pattern18(int n) {
        char ch = (char) ('A' + n - 1);
        char ch_temp = ch;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch_temp + " ");
                ch_temp++;
            }
            System.out.println();
            ch--;
            ch_temp = ch;
        }
    }
}