/* Approach : We don't need to check each element of an array with other array elements if it is in the correct position of a sorted array, instead we can just simply traverse the array and check if it is smaller than next element. Because if it is not sorted then the condition fails at some point. */
// Time Complexity = O(n)
// Space Complexity = O(1)

package Basics.BasicArrays;

class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }
}