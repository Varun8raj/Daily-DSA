/* Approach : The approach is very much similar to the reversing a string using recursion, just swap the ith index element and jth index element recursively until the base condition is met.*/
// Time Complexity = O(n)
// Space Complexity = O(n)

package Basics.BasicRecursion;

class Solution {
    public int[] reverseArray(int[] nums) {
        return ArrayReversal(nums, 0, nums.length - 1);
    }

    private int[] ArrayReversal(int[] nums, int i, int j) {
        if (i > j)
            return nums;
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return ArrayReversal(nums, i + 1, j - 1);
    }
}