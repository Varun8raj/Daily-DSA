/* Approach :  The most efficient strategy is to use hashing technique to solve this problem, we can just have a hash array with size equal to max element of the array, which stores the count of each element, then we need to traverse the hash array with few if else statements get the second highest occuring element.*/
// Time Complexity = O(3 * n) ~ O(n)
// Space Complexity = O(n)

package Basics.BasicHashing;

class Solution {
    public int secondMostFrequentElement(int[] nums) {
        int maxele = nums[0];
        int maxcount1, maxcount2, ele1, ele2;
        maxcount1 = 0;
        maxcount2 = 0;
        ele1 = -1;
        ele2 = -1;
        for (int i = 1; i < nums.length; i++) {
            if (maxele < nums[i])
                maxele = nums[i];
        }
        int[] hash = new int[maxele + 1];
        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }
        for (int i = 0; i < maxele + 1; i++) {
            if (hash[i] > maxcount1) {
                maxcount2 = maxcount1;
                ele2 = ele1;
                ele1 = i;
                maxcount1 = hash[i];
            } else if (hash[i] == maxcount1)
                continue;
            else if (hash[i] > maxcount2) {
                maxcount2 = hash[i];
                ele2 = i;
            } else if (hash[i] == maxcount2) {
                if (ele2 > i)
                    ele2 = i;
            }
            // System.out.println("ele1: " + ele1 + " " + maxcount1);
            // System.out.println("ele2: " + ele2 + " " + maxcount2);
        }
        return ele2;
    }
}
