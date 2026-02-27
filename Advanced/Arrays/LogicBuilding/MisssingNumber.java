/* Approach : We can solve this problem by just first sorting the array, and if the index and the element stored at index is not same, then we just return the index. We could also improve the time effiency bu using bit manipulation XOR approach.*/
// Time Complexity = O(nlogn)
// Space Complexity = O(1)

package Advanced.Arrays.LogicBuilding;

import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i])
                return i;
        }
        return nums.length;
    }
}