/* Approach : The approach is again simple just to make a recursive call with the sum until you reach the base condition*/
// Time Complexity = O(n)
// Space Complexity = O(n) 

package Basics.BasicRecursion;

class Solution {
    public int arraySum(int[] nums) {
        return ArrSum(nums, nums.length - 1);
    }

    public int ArrSum(int[] nums, int index) {
        if (index < 0)
            return 0;
        return nums[index] + ArrSum(nums, index - 1);
    }
}