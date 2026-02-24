/* Approach : Bubble sort is a sorting technique where we first compare adjacent 2 elements and swap them accordingly until the largest element is pushed to the last position. We repeat this so at  each iteration the current largest element moves to the last available index.*/
// Time Complexity = O(n^2)
// Space Complexity = O(1) 

package Advanced.Sorting;

class Solution {
    public int[] bubbleSort(int[] nums) {
        int temp;
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
}