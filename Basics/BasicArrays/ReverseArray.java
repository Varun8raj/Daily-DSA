/* Approach : We can reverse an array in a simple fashion, by just using 2 pointers, one is at start and one is at end and then swapping these as we traverse, finally we can get the reverse of an array. */
// Time Complexity = O(n)
// Space Complexity = O(1)

package Basics.BasicArrays;

class Solution {
    public void reverse(int[] arr, int n) {
        int i, j, temp;
        i = 0;
        j = n - 1;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
