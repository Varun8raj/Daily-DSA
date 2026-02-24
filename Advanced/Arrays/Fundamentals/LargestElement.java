/* Approach : We just search for the largest element in a linear fashion, and we track the largest element with a variable, and after the traversal of an array we just return the largest element.*/
// Time Complexity = O(n)
// Space Complexity = O(1) 

package Advanced.Arrays.Fundamentals;

class Solution {
    public int largestElement(int[] nums) {
        int largeele = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largeele)
                largeele = nums[i];
        }
        return largeele;
    }
}
