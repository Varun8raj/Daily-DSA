/* Approach : We can make a recursive call to add the number to the sum, till the number becomes 0 and then we can return the total sum*/
// Time Complexity = O(n)
// Space Complexity = O(n) 

package Basics.BasicRecursion;

class Solution {
    public int NnumbersSum(int N) {
        long sum = 0;
        return NumSum(N, sum);
    }

    public int NumSum(int N, long sum) {
        if (N == 0)
            return (int) sum;
        int total = NumSum(N - 1, sum + N);
        return total;
    }
}