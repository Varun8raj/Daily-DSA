/* Approach : We can approach this problem by using merge sort, where we just need to count all the inversion pairs while merging and as the final array gets sorted we get all the accumulated count of inversion pairs which results in total count. */
// Time Complexity = O(n * logn)
// Space Complexity = O(1)

package Advanced.Arrays.FAQS_Hard;

class Solution {
    private long merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int index = 0;
        long cnt = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[right++];
                cnt += (mid - left + 1);
            }
        }
        while (left <= mid) {
            temp[index++] = arr[left++];
        }
        while (right <= high) {
            temp[index++] = arr[right++];
        }

        System.arraycopy(temp, 0, arr, low, high - low + 1);

        return cnt;
    }

    private long mergeSort(int[] arr, int low, int high) {
        long cnt = 0;
        if (low < high) {
            int mid = low + (high - low) / 2;
            cnt += mergeSort(arr, low, mid);
            cnt += mergeSort(arr, mid + 1, high);
            cnt += merge(arr, low, mid, high);
        }
        return cnt;
    }

    public long numberOfInversions(int[] nums) {
        int n = nums.length;
        return mergeSort(nums, 0, n - 1);
    }
}