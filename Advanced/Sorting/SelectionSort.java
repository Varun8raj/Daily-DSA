/* Approach : In selection sort, at each iteration the array is divided into 2 parts, one is sorted and other is unsorted, we need to pick the smallest from the unsorted and place it in the sorted section of the array, over the time the unsorted section becomes 0 and the complete array gets sorted.*/
// Time Complexity = O(n^2)
// Space Complexity = O(1) 

package Advanced.Sorting;

class Solution {
    public int[] selectionSort(int[] nums) {
        int small, index, temp;
        for (int i = 0; i < nums.length; i++) {
            small = nums[i];
            index = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < small) {
                    index = j;
                    small = nums[j];
                }
            }
            temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
        return nums;
    }
}
