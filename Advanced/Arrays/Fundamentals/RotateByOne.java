/* Approach : In order to rotate the array to the left by one position, we can simply reassign every element to the next element until the last second element. For the last element we can just assign the old value of the first element of the array */
// Time Complexity = O(n)
// Space Complexity = O(1) 

package Advanced.Arrays.Fundamentals;

class Solution {
    public void rotateArrayByOne(int[] nums) {
        int firstele = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = firstele;
    }
}
