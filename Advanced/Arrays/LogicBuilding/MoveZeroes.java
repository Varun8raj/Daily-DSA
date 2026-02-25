/* Approach : We can solve this problem using 2 pointers, where one pointer keep track of the index of 0 and other pointer keep track of non-zero numbers, And we just swap them so that after traversing through the array, all the 0's are pushed to the back.*/
// Time Complexity = O(n)
// Space Complexity = O(1) 

package Advanced.Arrays.LogicBuilding;

class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        int temp;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
