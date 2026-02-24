/* Approach : So the approach for this problem is first take out the unnecessary rotations by updating the k with k % arraylength, then we can split the arrays into 2 parts based on k. first part is 0 to k-1, second part is k to arraylength-1, and then we need to reverse the elements of each subarray and then finally reverse the complete array. This can be done without using the extra space. */
// Time Complexity = O(n)
// Space Complexity = O(1) 

package Advanced.Arrays.Fundamentals;

class Solution {
    public void rotateArray(int[] nums, int k) {
        int len = nums.length;
        int pos = k % len;
        reverseArray(nums, 0, pos - 1);
        reverseArray(nums, pos, len - 1);
        reverseArray(nums, 0, len - 1);
    }

    private void reverseArray(int[] nums, int start, int end) {
        int temp;
        while (start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}