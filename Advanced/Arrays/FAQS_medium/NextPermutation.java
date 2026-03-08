/* Approach : This problem can be solved by first understanding the problem and finding the pattern. We first need to find the breaking point to find the element. Next we need to arrange the elements after this breaking point so that the final nums array to be the next permutation */
// Time Complexity = O(3 * n)
// Space Complexity = O(1)

package Advanced.Arrays.FAQS_medium;

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        if (ind == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > ind; i--) {
            if (nums[i] > nums[ind]) {
                swap(nums, i, ind);
                break;
            }
        }

        reverse(nums, ind + 1, n - 1);
        return;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
