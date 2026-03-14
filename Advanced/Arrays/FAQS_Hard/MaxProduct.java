/* Approach : We can approach this problem by calculating the prefix product and suffix product of an array, since if the array has all the positive elements then the max product is product of all the elements, if it has even -ve's then also max product is product of all the elements, but if it has odd -ve's then the max product will be either to the prefix of a negative number or suffix to the negative number. While calculating the product if the element is 0 then we just reassign the product to 1. */
// Time Complexity = O(n)
// Space Complexity = O(1)

package Advanced.Arrays.FAQS_Hard;

class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        int prefix = 1, suffix = 1;
        for (int i = 0; i < n; i++) {
            if (prefix == 0)
                prefix = 1;
            if (suffix == 0)
                suffix = 1;
            prefix *= nums[i];
            suffix *= nums[n - i - 1];
            ans = Math.max(ans, Math.max(prefix, suffix));
        }
        return ans;
    }
}