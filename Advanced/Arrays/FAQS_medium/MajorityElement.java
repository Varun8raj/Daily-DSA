/* Approach : We can approach this problem by using the boyer-moore's voting algorithm, we keep track of an element's count by traversing through the array, and if an element is different from the tracking element we reduce the count, and if it is zero then we just change the tracking element to the new one. */
// Time Complexity = O(n)
// Space Complexity = O(n)

package Advanced.Arrays.FAQS_medium;

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int count2 = 0;
        int element = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count = 1;
                element = nums[i];
            } else if (nums[i] == element)
                count++;
            else
                count--;
        }
        for (int i = 0; i < nums.length; i++) {
            if (element == nums[i])
                count2++;
            if (count2 > nums.length / 2)
                return element;
        }
        return -1;
    }
}