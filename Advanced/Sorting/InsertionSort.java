/* Approach : Insertion sort builds a sorted array one element at a time by repeatedly picking the next element and inserting it into its correct position within the already sorted part of the array.*/
// Time Complexity = O(n^2)
// Space Complexity = O(1) 

package Advanced.Sorting;

class Solution {
    public int[] insertionSort(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
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
