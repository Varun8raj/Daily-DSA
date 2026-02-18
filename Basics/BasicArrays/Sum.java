/* Approach : We need to get the sum of elements of an array, it is simple and efficient to traverse in 2 directions (starting and ending) at the same time and break it when then they collide because it doesn't change the overall sum even if we traverse only in one direction */
// Time Complexity = O(n/2) ~ O(n)
// Space Complexity = O(1)

package Basics.BasicArrays;

class Solution {
    public int sum(int arr[], int n) {
        int i, j;
        i = 0;
        j = n - 1;
        int sum = 0;
        while (i < j) {
            sum = sum + arr[i] + arr[j];
            i++;
            j--;
        }
        if (i == j)
            sum = sum + arr[i];
        return sum;
    }
}
