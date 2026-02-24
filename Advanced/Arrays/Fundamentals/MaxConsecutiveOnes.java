/* Approach : In order to find the maximum consecutive ones, we just need to traverse the array and keep track of the current consecutive ones count, if at any point this count increases then we need to assign the value of the maximum consecutive ones as the current count. If you come across the value 0 then obviously the current count becomes 0*/
// Time Complexity = O(n)
// Space Complexity = O(1) 

package Advanced.Arrays.Fundamentals;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int lcount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (lcount < count)
                    lcount = count;
            } else
                count = 0;
        }
        return lcount;
    }
}