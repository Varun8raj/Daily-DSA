/* Approach : We can solve this problem by just traversing the array and placing the elements in the new array based on the array index, if the element is positive we place it on the even index and if it is negative we place it on the odd index preserving the order of the elements.*/
// Time Complexity = O(n)
// Space Complexity = O(n)

package Advanced.Arrays.FAQS_medium;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posindex = 0;
        int negindex = 1;
        int[] arr = new int[nums.length];
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] > 0) {
                arr[posindex] = nums[k];
                posindex += 2;
            } else {
                arr[negindex] = nums[k];
                negindex += 2;
            }
        }
        return arr;
    }
}