/* Approach : This problem is an application of kadane's algorithm, where we use 2 variables global sum and current sum. If the sum goes to negative then we just assign the current sum to 0 as the elements till now are useless as it doesn't yield a positive value, if it exceeds the global max then we can reassign the global max and if it stays positive even though it has decreased then we still keep the current sum as it is as the future elements might yield an higher value*/
// Time Complexity = O(n)
// Space Complexity = O(1)

package Advanced.Arrays.FAQS_medium;

class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > maxsum)
                maxsum = sum;

            if (sum < 0)
                sum = 0;
        }
        return maxsum;
    }
}