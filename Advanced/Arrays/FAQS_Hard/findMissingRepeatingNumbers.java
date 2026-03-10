/* Approach : We can approach this problem by using the bit manipulation strategy to find the solution array. First we xor all the elements of an array along with doing xor on all numbers from 1 to nums.length-1, then we will get the xor of the missing number and repeated number. We then find the differentiator bit to arrange the (array elements and the numbers from 1 to nums.length-1) in to 2 groups, 0 group and a 1 group we then know that the missing number and a repeated number is the remaining element in each group. */
// Time Complexity = O(n)
// Space Complexity = O(1)

package Advanced.Arrays.FAQS_Hard;

class Solution {
    public int[] findMissingRepeatingNumbers(int[] nums) {
        int n = nums.length;
        int xr = 0;

        for (int i = 0; i < n; i++) {
            xr = xr ^ nums[i];
            xr = xr ^ (i + 1);
        }
        int number = (xr & ~(xr - 1));
        int zero = 0;
        int one = 0;

        for (int i = 0; i < n; i++) {
            if ((nums[i] & number) != 0) {
                one = one ^ nums[i];
            } else {
                zero = zero ^ nums[i];
            }
        }
        for (int i = 1; i <= n; i++) {
            if ((i & number) != 0) {
                one = one ^ i;
            } else {
                zero = zero ^ i;
            }

        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == zero) {
                cnt++;
            }
        }

        if (cnt == 2) {
            return new int[] { zero, one };
        }
        return new int[] { one, zero };
    }
}