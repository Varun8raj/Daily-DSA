/* Approach :  The most efficient strategy is to use hashing technique to solve this problem, we can just have a hash array with size equal to max element of the array, which stores the count of each element, then we need to traverse the hash array to get the highest frequency and lowest frequency and return the sum.*/
// Time Complexity = O(3 * n) ~ O(n)
// Space Complexity = O(n)

package Basics.BasicHashing;

class Solution {
    public int sumHighestAndLowestFrequency(int[] nums) {
        int maxele = nums[0];
        int hfreq, lfreq;
        hfreq = 0;
        for (int i = 1; i < nums.length; i++) {
            if (maxele < nums[i])
                maxele = nums[i];
        }
        int[] hash = new int[maxele + 1];
        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }
        lfreq = nums.length;
        for (int i = 0; i < maxele + 1; i++) {
            if (hash[i] > hfreq) {
                hfreq = hash[i];
            }
            if (hash[i] < lfreq) {
                if (hash[i] != 0)
                    lfreq = hash[i];
            }
        }
        return hfreq + lfreq;
    }
}
