/* Approach : We can find the second largest element by simply traversing the array in a linear fashion, but first we need to assign the largest and second largest with MIN_VALUE and then use approriate if else statements to find the largest and second largest element*/
// Time Complexity = O(n)
// Space Complexity = O(1) 

package Advanced.Arrays.Fundamentals;

class Solution {
    public int secondLargestElement(int[] nums) {
        int flarge, slarge;
        if (nums.length <= 1)
            return -1;
        flarge = Integer.MIN_VALUE;
        slarge = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > flarge) {
                slarge = flarge;
                flarge = nums[i];
            } else if (nums[i] > slarge && nums[i] != flarge) {
                slarge = nums[i];
            }
        }
        return slarge == Integer.MIN_VALUE ? -1 : slarge;
    }
}
