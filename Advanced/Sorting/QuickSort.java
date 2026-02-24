/* Approach : We use divide and conquer technique, where we first select a random pivot element(first element in our case), and then we place that element in the correct place with smaller elements to the left and larger to the right, we repeat this process for the left and right sub arrays recursively until the array is sorted.*/
// Time Complexity = O(n^logn)
// Space Complexity = O(1) 

package Advanced.Sorting;

class Solution {
    public int[] quickSort(int[] nums) {
        quickSorting(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSorting(int[] nums, int low, int high) {
        if (low < high) {
            int pindex = partition(nums, low, high);
            quickSorting(nums, low, pindex - 1);
            quickSorting(nums, pindex + 1, high);
        }
    }

    private int partition(int[] nums, int low, int high) {
        int pivot = nums[low];
        int i = low;
        int j = high;
        int temp;
        while (i < j) {
            while (nums[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (nums[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;
        return j;
    }
}