/* Approach : We can solve this problem by simply traversing backwards, and keeping track of the largest element and if the current element is larger than the largest element so far then we add it to the list.*/
// Time Complexity = O(n)
// Space Complexity = O(1)

package Advanced.Arrays.FAQS_medium;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public List<Integer> leaders(int[] nums) {
        int largest = nums[nums.length - 1];
        List<Integer> list = new ArrayList<>();
        list.add(largest);
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > largest) {
                list.add(nums[i]);
                largest = nums[i];
            }
        }
        Collections.reverse(list);
        return list;
    }
}