/* Approach : This is a dutch national flag algorithm problem, where we use 3 pointers low, mid and high. And first we assign low and mid to 0 and high to nums.length-1, we assume that at given point 0 to low-1 have all zeroes, low to mid-1 have all ones, mid to high is an unsorted array and high + 1 to nums.length-1 have all twos. So, we just swap the elements while traversing the mid pointer till it crosses the pointer high.*/
// Time Complexity = O(n)
// Space Complexity = O(1)

package Advanced.Arrays.FAQS_medium;

class Solution {
    public void sortZeroOneTwo(int[] nums) {
        int temp, low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++;
                low++;
            } else if (nums[mid] == 1)
                mid++;
            else {
                temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}