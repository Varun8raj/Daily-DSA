/* Approach : We can just check if the 2 elements are sorted accordingly and then recursively traverse from one end of an array to other end and see if the condition is satisfied, If Yes the array is sorted, if Not then return false.*/
// Time Complexity = O(n)
// Space Complexity = O(n)

package Basics.BasicRecursion;

import java.util.ArrayList;

class Solution {
    public boolean isSorted(ArrayList<Integer> nums) {
        return SortCheck(nums, 0);
    }

    private boolean SortCheck(ArrayList<Integer> nums, int i) {
        if (i > nums.size() - 2)
            return true;
        if (nums.get(i) > nums.get(i + 1))
            return false;
        return SortCheck(nums, i + 1);
    }
}