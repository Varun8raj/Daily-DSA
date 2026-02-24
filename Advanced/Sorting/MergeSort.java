/* Approach : We use divide and conquer technique to recursively break the array into halves, and then merge it with sorting. So finally we break the dividing process when there is a single element and then start merging.*/
// Time Complexity = O(n^logn)
// Space Complexity = O(n) 

package Advanced.Sorting;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] mergeSort(int[] nums) {
        mergeSorting(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSorting(int[] nums, int leftindex, int rightindex) {
        if (leftindex >= rightindex)
            return;
        int mid = (leftindex + rightindex) / 2;
        mergeSorting(nums, leftindex, mid);
        mergeSorting(nums, mid + 1, rightindex);
        merge(nums, leftindex, mid, rightindex);
    }

    private void merge(int[] nums, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            } else {
                temp.add(nums[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(nums[left]);
            left++;
        }
        while (right <= high) {
            temp.add(nums[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }
    }
}