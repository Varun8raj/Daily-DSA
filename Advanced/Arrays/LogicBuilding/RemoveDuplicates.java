/* Approach : We can solve this problem using 2 pointers, where one pointer keep track of the unique elements as we travers and other pointer keep track of the last unique element found, And we just need to arrange the values such that the unique elements are found at the starting section of the array and the remaining elements are ignore worthy.*/
// Time Complexity = O(n)
// Space Complexity = O(1)

package Advanced.Arrays.LogicBuilding;

class Solution {
    public int removeDuplicates(int[] nums) {
        int count;
        int j = 0;
        count = 1;
        int number = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != number) {
                j++;
                number = nums[i];
                nums[j] = nums[i];
                count++;
            }
        }
        return count;
    }
}