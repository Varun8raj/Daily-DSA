/* Approach : We need to get the count of elements which are odd in an array, it is simple and efficient to traverse in 2 directions (starting and ending) at the same time and break it when then they collide because the count doesn't change even if we traverse only in one direction */
// Time Complexity = O(n/2) ~ O(n)
// Space Complexity = O(1)

package Basics.BasicArrays;

class Solution {
    public int countOdd(int[] arr, int n) {
        int i, j;
        int count = 0;
        i = 0;
        j = n - 1;
        while (i < j) {
            if (arr[i] % 2 == 1)
                count++;
            if (arr[j] % 2 == 1)
                count++;
            i++;
            j--;
        }
        if (i == j) {
            if (arr[i] % 2 == 1)
                count++;
        }
        return count;
    }
}